package org.qrl.http.entity.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class XtyPushBaseRequest<T> implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -7051352730445600834L;

    private String msgId;
    private String msgType;
    private T content;

}
