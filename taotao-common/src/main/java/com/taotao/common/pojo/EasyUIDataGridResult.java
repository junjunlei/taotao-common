package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * dataGrid展示的pojo
 * 
 * @author Junjunlei
 *
 */
public class EasyUIDataGridResult implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * json数据
	 */
	private List<?> rows;
	/**
	 * 总数
	 */
	private Integer total;

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}
