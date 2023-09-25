class Product {
  String name;
  String description;
  double price;

  Product(String name, String description, double price) {
    this.name = name;
    this.description = description;
    this.price = price;
  }
}

abstract class ProductFactory {
  abstract Product createProduct();
}

class BookFactory extends ProductFactory {
  @Override
  Product createProduct() {
    return new Book("O Senhor dos Anéis", "Um clássico da literatura fantástica", 50.00);
  }
}

class MovieFactory extends ProductFactory {
  @Override
  Product createProduct() {
    return new Movie("O Poderoso Chefão", "Um dos melhores filmes de todos os tempos", 20.00);
  }
}

class ProductManager {
  ProductFactory factory;

  ProductManager(ProductFactory factory) {
    this.factory = factory;
  }

  void createProduct(String name, String description, double price) {
    Product product = factory.createProduct();
    product.name = name;
    product.description = description;
    product.price = price;
  }

  void listProducts() {
    for (Product product : products) {
      System.out.println(product);
    }
  }
}
