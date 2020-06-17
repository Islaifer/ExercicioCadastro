package controller;

import model.NO;
import model.entity.Pessoa;

public class Fila {
	private NO start;
	public Fila() {
		this.start = null;
	}
	
	/*---------------------Adicionar elemento---------------------*/
	public void adicionar(Pessoa data) {
		NO n = new NO(data);
		if(this.start == null) {
			this.start = n;
		}else {
			NO aux = this.start;
			while(aux.getNext()!=null) {
				aux = aux.getNext();
			}
			aux.setNext(n);
		}
	}
	
	/*---------------------Remover elemento---------------------*/
	public Pessoa remover() {
		if(this.start==null) {
			return null;
		}else {
			Pessoa data = this.start.getData();
			this.start = this.start.getNext();
			return data;
		}
	}
	
	/*-----------------------Mostrar toda a fila---------------------------*/
	public String mostrar() {
		if(this.start == null) {
			return null;
		}else {
			String data;
			StringBuffer buffer = new StringBuffer();
			NO aux = this.start;
			while(aux!=null) {
				buffer.append("Codigo: " + aux.getData().getCod() + " |Nome: " 
			+ aux.getData().getNome() + " |Email: " + aux.getData().getEmail() + "\n");
				aux = aux.getNext();
			}
			data = buffer.toString();
			return data;
		}
	}
}
