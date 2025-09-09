package ex07;

public class Pessoa {
	
	   public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	   public String nome; 
	   public int idade; 
	   public double peso; 
	   public double altura;
	   
	   
	   public void envelhecer(int anos) {
		   for (int i = 1; i<=anos; i++) {
		   		this.idade ++;
			    if (this.idade < 21) {
			    	this.altura += 0.5; 
		   }
   
	      }
	}
	   
	   public void engordar(double kg) {
	        this.peso += kg;
	    }
	   
	   public void emagrecer(double kg) {
	        this.peso -= kg;
	    }

	    public void crescer(double cm) {
	        this.altura += cm;
	    }
	    
	    public void mostrarDados() {
	        System.out.println("Nome: " + this.nome);
	        System.out.println("Idade: " + this.idade + " anos");
	        System.out.println("Peso: " + this.peso + " kg");
	        System.out.println("Altura: " + this.altura + " cm");
	    }

}
