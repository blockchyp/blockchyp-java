#!/usr/bin/env bash

set -eu

openssl aes-256-cbc -d -in ./.github/ossrh-gpg-key -out ./.github/ossrh-gpg-key.asc -k "$ENCRYPTION_KEY"
gpg --batch --import ./.github/ossrh-gpg-key.asc
