open class Book() {

    private var title = "";
    private var author = "";
    private var price = 0.0;

    var titleFun: String
        get() {
            return title;
        }
        set(value) {
            title = value;
        }
    var authorFun: String
        get() {
            return author;
        }
        set(value) {
            author = value;
        }
    var priceFun: Double
        get() {
            return price;
        }
        set(value) {
            price = value;
        }

    constructor(title: String, author: String, price: Double) : this() {
        this.title = title
        this.author = author
        this.price = price
    }

    open fun read() {
        println("Reading Paper book")
    }
}