package stockable

import Server

class StockableModel(val name:String, private val tableName:String, val displayName:String, val properties:HashMap<String, String>){
    private val server = Server("", "", "", tableName)
    fun buildStockable(vararg values:Any):Stockable{
        fun checkValidity(vararg values:Any):Boolean{
            TODO("Check validity")
        }
        fun bindToProperties(vararg values:Any):PropertySet{
            TODO("Bind to properties")
        }
        TODO("Generate stockable")
    }

    fun addToDatabase(stockable:Stockable){
        fun generateQuery(stockable:Stockable){
            TODO("Generate Query")
        }
        TODO("Add to Database")
    }

    fun deleteFromDatabase(stockable:Stockable){
        fun generateQuery(stockable:Stockable){
            TODO("Generate Query")
        }
        TODO("Add to Database")
    }
}