package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		
		int num = scan.nextInt();
		
		  int u,d,c;
	         
	         StringBuilder extenso = new StringBuilder();
	         String[] unidade,dezena,dezenaespecial, centena;
	         
	         unidade        = new String[10];
	         dezena         = new String[10];
	         dezenaespecial = new String[10];
	         centena = new String[10];
	         
	         unidade[0] = "";
	         unidade[1] = "um";
	         unidade[2] = "dois";
	         unidade[3] = "três";
	         unidade[4] = "quatro";
	         unidade[5] = "cinco";
	         unidade[6] = "seis";
	         unidade[7] = "sete";
	         unidade[8] = "oito";
	         unidade[9] = "nove";
	         
	         dezena[0] = "";
	         dezena[1] = "dez";
	         dezena[2] = "vinte";
	         dezena[3] = "trinta";
	         dezena[4] = "quarenta";
	         dezena[5] = "cinquenta";
	         dezena[6] = "sessenta";
	         dezena[7] = "setenta";
	         dezena[8] = "oitenta";
	         dezena[9] = "noventa";
	         
	         dezenaespecial[0] = "dez";
	         dezenaespecial[1] = "onze";
	         dezenaespecial[2] = "doze";
	         dezenaespecial[3] = "treze";
	         dezenaespecial[4] = "quatorze";
	         dezenaespecial[5] = "quinze";
	         dezenaespecial[6] = "dezesseis";
	         dezenaespecial[7] = "dezessete";
	         dezenaespecial[8] = "dezoito";
	         dezenaespecial[9] = "dezenove";
	         
	        centena[0] = "";
	 		centena[1] = "cem";
	 		centena[2] = "duzentos";
	 		centena[3] = "trezentos";
	 		centena[4] = "quatrocentos";
	 		centena[5] = "quinhentos";
	 		centena[6] = "seiscentos";
	 		centena[7] = "setecentos";
	 		centena[8] = "oitocentos";
	 		centena[9] = "novecentos";
	         
	        if(num >= 1 && num <= 999) {
	        	c = num / 100;
	        	d = (num - (c * 100)) / 10;
	        	u = (num - (c * 10)) % 10;
	        	
	        	if(c > 0 && d > 0 && u > 0 && num > 19 ) {
	        		extenso.append(centena[c] + " e " + dezena[d] + " e " + unidade[u]);
	        	}
	        	
	        	else if(c > 0 && d > 0 && u == 0 && num > 19 ) {
	        		extenso.append(centena[c] + " e " + dezena[d]);
	        	}
	        	
	        	else if(c > 0 && d == 0 && u > 0 && num > 19 ) {
	        		extenso.append(centena[c] + " e " + unidade[u]);
	        	}
	        	
	        	else if(c > 0 && d == 0 && u == 0 && num > 19 ) {
	        		extenso.append(centena[c]);
	        	}
	        	
	        	else if (d > 0 && u > 0 && num > 19)
	              {
	            	  extenso.append(dezena[d] + " e " + unidade[u]);
	              }
	        	
	        	else if (d > 0 && u == 0 && num > 19)
	              {
	            	  extenso.append(dezena[d]);
	              }
	        	
	        	else if (num >= 10 && num <= 19)
	              {
	                   extenso.append(dezenaespecial[ u ]);
	              }
	        	
	        	else if (num < 10)
	              {
	            	  extenso.append(unidade[u]);
	              }
	        	
	        	else
		            {
		               extenso.append("Valor inválido");
		            }
	        }
	        else {
	        	System.out.println("Valor inválido.");
	        }
	        
	        System.out.println(extenso.toString());
	}
}
	
