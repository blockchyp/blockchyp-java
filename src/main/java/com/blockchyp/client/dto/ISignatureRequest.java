/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */

package com.blockchyp.client.dto;

import com.blockchyp.client.dto.SignatureFormat;

/**
 * A request for customer signature data.
 */

public interface ISignatureRequest {

     String getSigFile();

     SignatureFormat getSigFormat();

     int getSigWidth();

     boolean isDisableSignature();


}

