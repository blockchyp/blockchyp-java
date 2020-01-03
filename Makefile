# Version config
TAG := $(shell git tag --points-at HEAD | sort --version-sort | tail -n 1)
LASTTAG := $(or $(shell git tag -l | sort -r -V | head -n 1),0.1.0)
SNAPINFO := $(shell date +%Y%m%d%H%M%S)git$(shell git log -1 --pretty=%h)
RELEASE := $(or $(BUILD_NUMBER), 1)
VERSION := $(or $(TAG:v%=%),$(LASTTAG:v%=%))-$(or $(BUILD_NUMBER), 1)$(if $(TAG),,.$(SNAPINFO))

# Executables
MVN = mvn

# Default target
.PHONY: all
all: clean build test

# Cleans build artifacts
.PHONY: clean
clean:
	$(MVN) clean

# Compiles the package
.PHONY: build
build:
	$(MVN) -Dmaven.test.skip=true package

# Runs unit tests
.PHONY: test
test:
	$(MVN) test -P unit-test

# Runs integration tests
.PHONY: integration
integration:
	BC_TEST_DELAY=5 $(MVN) test -P integration

# Performs any tasks necessary before a release build
.PHONY: stage
stage:
	$(MVN) versions:set -DnewVersion=$(VERSION)

# Publishes package
.PHONY: publish
publish:
	$(MVN) -Prelease nexus-staging:release -DstagingRepositoryId=comblockchyp-1001
