
public class PrincipalIBOPE {

	public static void main(String[] args) throws ArrayNotPossibleException {
		Candidato[] candidato = new Candidato[(int) (Math.random() * 1000)];
		String[] partidos = { "NOVO", "PT", "PSDB", "PMDB", "PSOL", "PCdoB", "PCC", "CV", "DEM", "PLL", "MDB", "PP",
				"PR", "PSTU", "PSB" };
		String[] nomes = { "João", "Rafael", "Kleber", "Cleber", "Clayton", "Cleyson", "Matheus", "Diogo", "Carlos",
				"Luiz", "Rafael", "Wesley", "Trump", "Bonoro", "Ciro", "Amoedo", "Haddad", "Marina", "Eduardo", "Jorge",
				"Leon", "Alexandre", "Adolf" };
		int eleitores = 1500 + (int) (Math.random() * ((2000 - 1500) + 1));

		candidato[0] = new Candidato("Branco", "Branco", 0);
		candidato[1] = new Candidato("Branco", "Branco", 0);
		for (int i = 2; candidato.length > i; i++) {

			candidato[i] = new Candidato(nomes[(int) (Math.random() * nomes.length)],
					partidos[(int) (Math.random() * partidos.length)], 0);

		}
		for (int j = 0; eleitores > j; j++) {
			int x = (int) (Math.random() * candidato.length);
			candidato[x].setVotos(candidato[x].getVotos() + 1);
		}

		IBOPE ibope = new IBOPE();
		ibope.candidatoMaisBemColocado(candidato);
		System.out.println("Ganhador: " + ibope.candidatoMaisBemColocado(candidato));
		System.out.println("Testando!");
		for (int i = 0; candidato.length > i; i++) {
			System.out.println(candidato[i]);

		}

	}

}