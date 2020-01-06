#!/usr/bin/env bash

set -eu

openssl aes-256-cbc -d -in ./.circleci/ossrh-gpg-key -out ./.circleci/ossrh-gpg-key.asc -k "$ENCRYPTION_KEY"
gpg --batch --import ./.circleci/ossrh-gpg-key.asc
