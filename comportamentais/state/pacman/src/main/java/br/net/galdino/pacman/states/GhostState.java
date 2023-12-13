package br.net.galdino.pacman.states;

import br.net.galdino.pacman.Ghost;

public interface GhostState {
	void spotPacman(Ghost ghost);
	void losePacman(Ghost ghost);
	void pacmanTurnsSpecial(Ghost ghost);
	void pacmanTurnsNormal(Ghost ghost);
	void eatenByPacman(Ghost ghost);
	void reachTheBase(Ghost ghost);
}