package com.taotao.common.pojo;

import java.io.Serializable;

/**
 * 富文本编辑器需要的响应 json
 * 
 * @author Junjunlei
 *
 */
public class PictureResult implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer error;// 错误编码
	private String message;// 错误信息
	private String url;// 图片地址

	public Integer getError() {
		return error;
	}

	public void setError(Integer error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
