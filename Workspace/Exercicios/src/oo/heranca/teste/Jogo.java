package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		
		Heroi heroi = new Heroi(10, 11);
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		System.out.println("Heroi tem ==> " + heroi.vida);
		System.out.println("Monstro tem ==> " + monstro.vida);
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		heroi.andar(Direcao.NORTE);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println("Heroi tem ==> " + heroi.vida);
		System.out.println("Monstro tem ==> " + monstro.vida);
		
		/*j1.andar(Direcao.NORTE); // usando enum
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		
		System.out.println(j1.x);
		System.out.println(j1.y);*/
	}
}
