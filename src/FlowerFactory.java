
public class FlowerFactory {

		public Flowers getInstance(String flower) {
			if(flower.equals("hibiscus") || flower.equals("Hibiscus")) {
				return new Hibiscus();
			}
			else if(flower.equals("jasmine") || flower.equals("Jasmine")) {
				return new Jasmine();
			}
			else if(flower.equals("lotus") || flower.equals("Lotus")) {
				return new Lotus();
			}
			else if(flower.equals("jasmine") || flower.equals("Jasmine")) {
				return new Marigold();
			}
			else {
				return new NotAvailable();
			}
		}
}
