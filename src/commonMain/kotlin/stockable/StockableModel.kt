package stockable

import AppSettings
import Server

class StockableModel(val name:String, private val tableName:String, val displayName:String, val properties:HashMap<String, String>){
    private val stockableArray = ArrayList<Stockable>()
    private val settings = AppSettings()
    private val server = Server(settings.getAddress(), settings.getUsername(), settings.getPassword(), tableName)

    fun buildStockable(vararg values:Any):Stockable{
        /**
         * Build stockable returns a Stockable by linking every parameter to
         * a Property, then generating a PropertySet, then build the Stockable
         * with the PropertySet as a parameter
         */
        fun checkValidity(vararg values:Any):Boolean{
            /**
             * That function checks if the parameters provided are correct based on data
             * type, then returns True or throws an exception
             */
            TODO("Check validity")
        }
        fun bindToProperties(vararg values:Any):PropertySet{
            /**
             * That function binds every argument to a property
             */
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