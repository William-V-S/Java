package com.loiane.cursojava.aula36.exerc;

public class Curso {
	private String nome;
	private String horario;
	private Professor Professor;
	private Aluno[] Alunos;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Professor getProfessor() {
		return Professor;
	}
	public void setProfessor(Professor professor) {
		Professor = professor;
	}
	public Aluno[] getAlunos() {
		return Alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		Alunos = alunos;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
}
