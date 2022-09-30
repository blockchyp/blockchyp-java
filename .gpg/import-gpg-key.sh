#!/usr/bin/env bash

set -eu

openssl aes-256-cbc -d -in ./.gpg/ossrh-gpg-key -out ./.gpg/ossrh-gpg-key.asc -k "$ENCRYPTION_KEY"
gpg --batch --import ./.gpg/ossrh-gpg-key.asc
