package com.blockchyp.client.dto;

import com.blockchyp.client.dto.SignatureFormat;

/**
 * 
 */

public interface ISignatureRequest {

     String getSigFile();

     SignatureFormat getSigFormat();

     int getSigWidth();


}

