package joelpb.com.github.businesscard

import android.app.Application
import joelpb.com.github.businesscard.data.AppDatabase
import joelpb.com.github.businesscard.data.BusinessCardRepository

class App: Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}