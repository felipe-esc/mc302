/*
 * 1) O programa retorna um erro avisando que o atrubuto não é vicível.
 * 2) Usando-se o método set para a alteração do atributo que é do tipo private.
 */
public class main {

	public static void main(String[] args) {
		usuario user1 = new usuario(1, "Goku", "goku_84@dbmail.com", "chichi@s2");
		usuario user2 = new usuario(2, "Piccolo", "piccolo_daimaoh@dbmail", "namek123");
		perfil perfil1 = new perfil('m', "1/2/762", "Distrito Leste", "Sólido", "123-4567", false, 2);
		perfil perfil2 = new perfil('m', "3/4/753", "Namek", "Sólido", "765-4321", false, 2);

		System.out.println("Usuario 1:\n" + user1);
		System.out.println("Usuario 2:\n" + user2);
		System.out.println("Perfil 1:\n" + perfil1);
		System.out.println("Perfil 1:\n" + perfil2);

		//user1.name = "Kakaroto";
	}

}
