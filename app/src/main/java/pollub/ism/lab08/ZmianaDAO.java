package pollub.ism.lab08;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface ZmianaDAO {

    @Insert
    public void insert(Zmiana zmiana);

    @Query("SELECT * FROM Zmiana WHERE WEGETABLE_ID = :idWarzywa")
    public Zmiana[] getChangesForWegetable(int idWarzywa);
}
