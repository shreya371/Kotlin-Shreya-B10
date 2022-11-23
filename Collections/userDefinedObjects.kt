package collections

class Product(id:Int,name:String,price:Double){
    var id=id
    var name=name
    var  price=price
}

fun main(){
    var products= mutableListOf<Product>()
    products.add(Product(1,"laptop",50000.0))
    products.add(Product(2,"laptop2",50002.0))

    for(product in products){
        println("${product.id} ,${product.name},${product.price}")

    }
}