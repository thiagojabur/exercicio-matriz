
public class Pincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] v;
		v = new int [4][];
		int tamanhoMaiorLinha = 0;
		int [] vetorSoma;
				
		v[0] = new int []{3, 4, 1, 6, 8, 9};
		v[1] = new int []{2, 2, 1, 0,6,45};
		v[2] = new int []{2, 1, 22};
		v[3] = new int []{5, 9, 11, 22, 43, 78};
		
		//vendo qual é a maior linha
		for (int i=0; i < v.length; i++ ){
			if (v[i].length > tamanhoMaiorLinha)
				tamanhoMaiorLinha = v[i].length;
		}
		
		vetorSoma = new int[tamanhoMaiorLinha];
		//mostrando a matriz na tela
		
		for (int i=0; i < v.length; i++ ){
			for (int j=0; j < v[i].length; j++) {
				//percorrendo as colunas
				System.out.print(v[i][j] + " ");
				vetorSoma[j] += v[i][j];
			}
			System.out.println(); //pula linha
		}
		System.out.println("_________________+");
		for (int i=0; i < vetorSoma.length; i++ ) {
			System.out.print(vetorSoma[i] + " ");
		}
	}

}
