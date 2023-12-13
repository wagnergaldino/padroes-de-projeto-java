package br.net.galdino.pacman.game;

@FunctionalInterface
public interface GameEventListener {
    void onAction(String option);
}