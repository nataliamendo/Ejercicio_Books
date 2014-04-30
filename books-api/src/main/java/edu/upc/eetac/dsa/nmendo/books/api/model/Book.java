package edu.upc.eetac.dsa.nmendo.books.api.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {

	
	private int bookid;
	private String titulo;
	private String autor;
	private String lengua;
	private String edicion;
	private String editorial;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private Date fechae = new Date();//fecha de edición
	private Date fechai = new Date();//fecha de impresión

	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getLengua() {
		return lengua;
	}
	
	public void setLengua(String lengua) {
		this.lengua = lengua;
	}
	
	public String getEdicion() {
		return edicion;
	}
	
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getEditorial() {
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Date getFechae() {
		return fechae;
	}
	public void setFechae(Date fechae) {
		this.fechae = fechae;
	}
	public Date getFechai() {
		return fechai;
	}
	public void setFechai(Date fechai) {
		this.fechai = fechai;
	}

	
	
}
