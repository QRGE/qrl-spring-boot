package org.qrl.common.api.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.qrl.common.constant.CommonConstant;

import java.io.Serializable;
import java.time.LocalDateTime;



@SuppressWarnings("unused")
@ApiModel(value="接口返回对象", description="接口返回对象")
@Data
public class Result<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "成功标志")
	private boolean success = true;

	@ApiModelProperty(value = "返回处理消息")
	private String message = "操作成功!";

	@ApiModelProperty(value = "返回代码")
	private Integer code = 0;

	@ApiModelProperty(value = "返回数据对象")
	private T result;

	@ApiModelProperty(value = "返回时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
	private LocalDateTime date = LocalDateTime.now();

	public Result() {}

	public static<T> Result<T> OK() {
		Result<T> r = new Result<>();
		r.setSuccess(true);
		r.setCode(CommonConstant.SC_OK_200);
		r.setMessage("成功");
		return r;
	}

	public static<T> Result<T> OK(T data) {
		Result<T> r = new Result<>();
		r.setCode(CommonConstant.SC_OK_200);
		r.setResult(data);
		return r;
	}

	public static<T> Result<T> OK(String msg, T data) {
		Result<T> r = new Result<>();
		r.setSuccess(true);
		r.setCode(CommonConstant.SC_OK_200);
		r.setMessage(msg);
		r.setResult(data);
		return r;
	}

	public static<T> Result<T> error(String msg, T data) {
		Result<T> r = new Result<>();
		r.setSuccess(false);
		r.setCode(CommonConstant.SC_INTERNAL_SERVER_ERROR_500);
		r.setMessage(msg);
		r.setResult(data);
		return r;
	}

	public static Result<Object> error(String msg) {
		return error(CommonConstant.SC_INTERNAL_SERVER_ERROR_500, msg);
	}

	public static Result<Object> error(int code, String msg) {
		Result<Object> r = new Result<>();
		r.setCode(code);
		r.setMessage(msg);
		r.setSuccess(false);
		return r;
	}

	public static <T> Result<T> error(int code, String msg, T result) {
		Result<T> r = new Result<>();
		r.setCode(code);
		r.setMessage(msg);
		r.setResult(result);
		r.setSuccess(false);
		return r;
	}

	public Result<T> error500(String message) {
		this.message = message;
		this.code = CommonConstant.SC_INTERNAL_SERVER_ERROR_500;
		this.success = false;
		return this;
	}
	/**
	 * 无权限访问返回结果
	 */
	public static Result<Object> noAuth(String msg) {
		return error(CommonConstant.SC_JEECG_NO_AUTHZ, msg);
	}
}
