package com.blockchyp.client.dto;

import com.blockchyp.client.SignatureFormat;

/**
 * 
 */

public interface ISignatureRequest {

     String getSigFile();

     SignatureFormat getSigFormat();

     int getSigWidth();


}

