public class IBOPE {

	public Candidato candidatoMaisBemColocado(Candidato[] candidato) throws ArrayNotPossibleException {
		if (candidato == null)
			throw new ArrayNotPossibleException();

		return candidatoMaisBemColocado(candidato, 0);

	}

	private Candidato candidatoMaisBemColocado(Candidato[] candidato, int index) {
		if (index > candidato.length -1) {
			return candidato[0];
		} else {
			Candidato x = candidatoMaisBemColocado(candidato, index + 1);
			if (x.getVotos() > candidato[index].getVotos()) {
				return x;
			} else {
				return candidato[index];
			}
		}

	}

}