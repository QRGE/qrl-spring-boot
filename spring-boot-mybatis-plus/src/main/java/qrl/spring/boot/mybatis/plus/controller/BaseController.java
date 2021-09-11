package qrl.spring.boot.mybatis.plus.controller;

/**
 * @Author: QR
 * @Date: 2021/9/11-11:34
 */
public class BaseController {
    protected Integer getPageSize(Integer param, Integer defaultValue) {
        param = getParam(param, defaultValue);
        if (param < 1) {
            param = defaultValue;
        }
        return param;
    }

    protected Integer getIntParam(Integer param, Integer defaultValue) {
        return getParam(param, defaultValue);
    }

    protected String getStringParam(String param, String defaultValue) {
        return getParam(param, defaultValue);
    }

    protected Double getDoubleParam(Double param, Double defaultValue) {
        return getParam(param, defaultValue);
    }

    private <T> T getParam(T param, T defaultValue) {
        if (param == null) {
            param = defaultValue;
        }
        return param;
    }
}
