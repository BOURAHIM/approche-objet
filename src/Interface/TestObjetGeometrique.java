package Interface;

public class TestObjetGeometrique {

	public static void main(String[] args) {
	objetGeometrique[] tab = new objetGeometrique[2];
	tab[0] = new Cercle(5);
	tab[1] = new Rectangle(4,8);

	for(int i = 0; i <= tab.length; i++) {
		System.out.println("perimetre est " + tab[i].perimetre()  +"Surface est" +tab[i].surface());
	}
	}

}
