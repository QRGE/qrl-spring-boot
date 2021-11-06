package org.qrl.http.entity.dto;

import lombok.Data;

import java.util.List;

@Data
public class XtySugarPush extends XtyPushBaseRequest<List<XtySugarRecord>> {

    /**
     *
     */
    private static final long serialVersionUID = 865145513575012178L;

    int actId;

}
