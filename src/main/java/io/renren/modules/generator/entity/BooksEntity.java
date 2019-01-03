package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-01-03 23:12:24
 */
@TableName("tb_books")
public class BooksEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String bookId;
	/**
	 * 
	 */
	private String bookName;
	/**
	 * 
	 */
	private String bookPress;
	/**
	 * 
	 */
	private Integer bookInventory;
	/**
	 * 
	 */
	private String bookAuthor;
	/**
	 * 
	 */
	private Integer currentInventory;

	/**
	 * 设置：
	 */
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	/**
	 * 获取：
	 */
	public String getBookId() {
		return bookId;
	}
	/**
	 * 设置：
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * 获取：
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * 设置：
	 */
	public void setBookPress(String bookPress) {
		this.bookPress = bookPress;
	}
	/**
	 * 获取：
	 */
	public String getBookPress() {
		return bookPress;
	}
	/**
	 * 设置：
	 */
	public void setBookInventory(Integer bookInventory) {
		this.bookInventory = bookInventory;
	}
	/**
	 * 获取：
	 */
	public Integer getBookInventory() {
		return bookInventory;
	}
	/**
	 * 设置：
	 */
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	/**
	 * 获取：
	 */
	public String getBookAuthor() {
		return bookAuthor;
	}
	/**
	 * 设置：
	 */
	public void setCurrentInventory(Integer currentInventory) {
		this.currentInventory = currentInventory;
	}
	/**
	 * 获取：
	 */
	public Integer getCurrentInventory() {
		return currentInventory;
	}
}
