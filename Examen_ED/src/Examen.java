
public class Examen {
	
	
		String cadena1 ;
		String cadena2;
		int num1;
		int num2;
		
		
		public Examen (String a, String b, int c, int d)
		{
			cadena1 = a;
			cadena2 = b;
			num1 = c;
			num2 = d;
		}
		
		//concatenar
		public static String Concatenar(String cadena1, String cadena2)
		{
		 return cadena1 + cadena2; 
		}
		
		//mayusculas
		public static  String Mayusculas(String cadena1)
		{
		 return cadena1.toUpperCase(); 
		}
		
		//longitud de cadena
		public static int Longitud(String cadena1)
		{
		 return cadena1.length(); 
		}
		
		
		//comparacion
		public static int comparacion(int num1, int num2) {

			if(num1>=num2)
				return 1;
			else
				return 0;
		}
		
		//cuadrado
		public static int cuadrado(int num1){
			
			return num1*num1;
		}
		//mayor que 10
		public static boolean mayor(int num1){
			if(num1>10)
				return true;
			else 
				return false;
		}
	}

