class EBook : Book {

    private var filetype = "";

    var filetypeFun: String
        get() {
            return filetype;
        }
        set(value) {
            filetype = value;
        }


    constructor(title: String, author: String, price: Double, filetype: String) :
            super(title, author, price) {
        this.filetype = filetype
    }

    override fun read() {
        println("Read from Electronic Device")
    }

}