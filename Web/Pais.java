package model;


public class Pais  {
	private int id;
	private String nome;
	private long populacao;
	private double area;

	public Pais() {
	}

	public Pais(int id, String nome, long populacao, double area) {
		
		this.id = id;
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getPopulacao() {
		return populacao;
	}

	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setPopulacao(Object object) {
		// TODO Auto-generated method stub
		
	}

	public void setArea(Object object) {
		// TODO Auto-generated method stub
		
	}
}

	