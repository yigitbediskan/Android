fun main() {

    var book = Book("The Da Vinci Code", "Dan Brown", 19.99);
    var ebook = EBook("The Lost Symbol", "Dan Brown", 8.19, "PDF");

    book.read();
    ebook.read();


    println(
        """
        Book:
        Title: ${book.titleFun}
        Author: ${book.authorFun}
        Price: ${book.priceFun}
    """.trimIndent()
    )

    // use setter
    book.authorFun = "Yigit";

    println(
        """
        After changed the author of Book:
        Title: ${book.titleFun}
        Author: ${book.authorFun}
        Price: ${book.priceFun}
    """.trimIndent()
    )

    println(
        """
        EBook:
        Title: ${ebook.titleFun}
        Author: ${ebook.authorFun}
        Price: ${ebook.priceFun}
        FileType:${ebook.filetypeFun}
    """.trimIndent()
    )

    //getter
    println(ebook.titleFun);

}