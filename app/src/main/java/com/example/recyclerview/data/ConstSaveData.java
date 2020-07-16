package com.example.recyclerview.data;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.recyclerview.activity.MainActivity;

public class ConstSaveData {
    public static int NUMBER_CORRECT_TIME_TO_BE_LEARNED = 5;
    public static String  DADATNHACNHO = "DADATNHACNHO";

    public static String GIADINH_POSITIONDAHOC = "GIADINH_POSITIONDAHOC";
    public static String GIADINH_lISTTUDATHUOC = "GIADINH_lISTTUDATHUOC";

    public static String AMNHAC_POSITIONDAHOC = "AMNHAC_POSITIONDAHOC";
    public static String AMNHAC_lISTTUDATHUOC = "AMNHAC_lISTTUDATHUOC";

    public static String BENHVIEN_POSITIONDAHOC = "BENHVIEN_POSITIONDAHOC";
    public static String BENHVIEN_lISTTUDATHUOC = "BENHVIEN_lISTTUDATHUOC";

    public static String BEPAN_POSITIONDAHOC = "BEPAN_POSITIONDAHOC";
    public static String BEPAN_lISTTUDATHUOC = "BEPAN_lISTTUDATHUOC";

    public static String BOPHANCOTHE_POSITIONDAHOC = "BOPHANCOTHE_POSITIONDAHOC";
    public static String BOPHANCOTHE_lISTTUDATHUOC = "BOPHANCOTHE_lISTTUDATHUOC";

    public static String DODUNGGIADINH_POSITIONDAHOC = "DODUNGGIADINH_POSITIONDAHOC";
    public static String DODUNGGIADINH_lISTTUDATHUOC = "DODUNGGIADINH_lISTTUDATHUOC";

    public static String DONGVAT_POSITIONDAHOC = "DONGVAT_POSITIONDAHOC";
    public static String DONGVAT_lISTTUDATHUOC = "DONGVAT_lISTTUDATHUOC";

    public static String GIAOTHONG_POSITIONDAHOC = "GIAOTHONG_POSITIONDAHOC";
    public static String GIAOTHONG_lISTTUDATHUOC = "GIAOTHONG_lISTTUDATHUOC";

    public static String HANHDONG_POSITIONDAHOC = "HANHDONG_POSITIONDAHOC";
    public static String HANHDONG_lISTTUDATHUOC = "HANHDONG_lISTTUDATHUOC";

    public static String HOAQUA_POSITIONDAHOC = "HOAQUA_POSITIONDAHOC";
    public static String HOAQUA_lISTTUDATHUOC = "HOAQUA_lISTTUDATHUOC";

    public static String MAUSAC_POSITIONDAHOC = "MAUSAC_POSITIONDAHOC";
    public static String MAUSAC_lISTTUDATHUOC = "MAUSAC_lISTTUDATHUOC";

    public static String NHAHANG_POSITIONDAHOC = "NHAHANG_POSITIONDAHOC";
    public static String NHAHANG_lISTTUDATHUOC = "NHAHANG_lISTTUDATHUOC";

    public static String SO_POSITIONDAHOC = "SO_POSITIONDAHOC";
    public static String SO_lISTTUDATHUOC = "SO_lISTTUDATHUOC";

    public static String QUANAO_POSITIONDAHOC = "QUANAO_POSITIONDAHOC";
    public static String QUANAO_lISTTUDATHUOC = "QUANAO_lISTTUDATHUOC";

    public static String RAUCU_POSITIONDAHOC = "RAUCU_POSITIONDAHOC";
    public static String RAUCU_lISTTUDATHUOC = "RAUCU_lISTTUDATHUOC";

    public static String SUNGHIEP_POSITIONDAHOC = "SUNGHIEP_POSITIONDAHOC";
    public static String SUNGHIEP_lISTTUDATHUOC = "SUNGHIEP_lISTTUDATHUOC";

    public static String THETHAO_POSITIONDAHOC = "THETHAO_POSITIONDAHOC";
    public static String THETHAO_lISTTUDATHUOC = "THETHAO_lISTTUDATHUOC";

    public static String THOITIET_POSITIONDAHOC = "THOITIET_POSITIONDAHOC";
    public static String THOITIET_lISTTUDATHUOC = "THOITIET_lISTTUDATHUOC";

    public static String TINHTU_POSITIONDAHOC = "TINHTU_POSITIONDAHOC";
    public static String TINHTU_lISTTUDATHUOC = "TINHTU_lISTTUDATHUOC";

    public static String TRUONGHOC_POSITIONDAHOC = "TRUONGHOC_POSITIONDAHOC";
    public static String TRUONGHOC_lISTTUDATHUOC = "TRUONGHOC_lISTTUDATHUOC";

    public static String VUON_POSITIONDAHOC = "VUON_POSITIONDAHOC";
    public static String VUON_lISTTUDATHUOC = "VUON_lISTTUDATHUOC";

    // tiếng anh lập trình
    public static String TALTPHAN1_POSITIONDAHOC = "TALTPHAN1_POSITIONDAHOC";
    public static String TALTPHAN1_lISTTUDATHUOC = "TALTPHAN1_lISTTUDATHUOC";

    public static String TALTPHAN2_POSITIONDAHOC = "TALTPHAN2_POSITIONDAHOC";
    public static String TALTPHAN2_lISTTUDATHUOC = "TALTPHAN2_lISTTUDATHUOC";

    public static String TALTPHAN3_POSITIONDAHOC = "TALTPHAN3_POSITIONDAHOC";
    public static String TALTPHAN3_lISTTUDATHUOC = "TALTPHAN3_lISTTUDATHUOC";

    public static String TALTPHAN4_POSITIONDAHOC = "TALTPHAN4_POSITIONDAHOC";
    public static String TALTPHAN4_lISTTUDATHUOC = "TALTPHAN4_lISTTUDATHUOC";

    public static String TALTPHAN5_POSITIONDAHOC = "TALTPHAN5_POSITIONDAHOC";
    public static String TALTPHAN5_lISTTUDATHUOC = "TALTPHAN5_lISTTUDATHUOC";

    public static String TALTPHAN6_POSITIONDAHOC = "TALTPHAN6_POSITIONDAHOC";
    public static String TALTPHAN6_lISTTUDATHUOC = "TALTPHAN6_lISTTUDATHUOC";

    // toeic
    public static String PHAN1_POSITIONDAHOC = "PHAN1_POSITIONDAHOC";
    public static String PHAN1_lISTTUDATHUOC = "PHAN1_lISTTUDATHUOC";

    public static String PHAN2_POSITIONDAHOC = "PHAN2_POSITIONDAHOC";
    public static String PHAN2_lISTTUDATHUOC = "PHAN2_lISTTUDATHUOC";

    public static String PHAN3_POSITIONDAHOC = "PHAN3_POSITIONDAHOC";
    public static String PHAN3_lISTTUDATHUOC = "PHAN3_lISTTUDATHUOC";

    public static String PHAN4_POSITIONDAHOC = "PHAN4_POSITIONDAHOC";
    public static String PHAN4_lISTTUDATHUOC = "PHAN4_lISTTUDATHUOC";

    public static String PHAN5_POSITIONDAHOC = "PHAN5_POSITIONDAHOC";
    public static String PHAN5_lISTTUDATHUOC = "PHAN5_lISTTUDATHUOC";

    public static String PHAN6_POSITIONDAHOC = "PHAN6_POSITIONDAHOC";
    public static String PHAN6_lISTTUDATHUOC = "PHAN6_lISTTUDATHUOC";

    //tiếng anh văn phòng
    public static String CHUCVUPHONGBAN_POSITIONDAHOC = "CHUCVUPHONGBAN_POSITIONDAHOC";
    public static String CHUCVUPHONGBAN_lISTTUDATHUOC = "CHUCVUPHONGBAN_lISTTUDATHUOC";

    public static String DOVATVANPHONG_POSITIONDAHOC = "DOVATVANPHONG_POSITIONDAHOC";
    public static String DOVATVANPHONG_lISTTUDATHUOC = "DOVATVANPHONG_lISTTUDATHUOC";

    public static String DUNGCUDEBAN_POSITIONDAHOC = "DUNGCUDEBAN_POSITIONDAHOC";
    public static String DUNGCUDEBAN_lISTTUDATHUOC = "DUNGCUDEBAN_lISTTUDATHUOC";

    public static String GIAYVANPHONG_POSITIONDAHOC = "GIAYVANPHONG_POSITIONDAHOC";
    public static String GIAYVANPHONG_lISTTUDATHUOC = "GIAYVANPHONG_lISTTUDATHUOC";

    public static String MAYMOC_POSITIONDAHOC = "MAYMOC_POSITIONDAHOC";
    public static String MAYMOC_lISTTUDATHUOC = "MAYMOC_lISTTUDATHUOC";

    public static String SOGHICHEP_POSITIONDAHOC = "SOGHICHEP_POSITIONDAHOC";
    public static String SOGHICHEP_lISTTUDATHUOC = "SOGHICHEP_lISTTUDATHUOC";

    public static String THUATNGU_POSITIONDAHOC = "THUATNGU_POSITIONDAHOC";
    public static String THUATNGU_lISTTUDATHUOC = "THUATNGU_lISTTUDATHUOC";

    //luu
    public static void SaveDataTypeNumberByName(String NameData, int value){
        SharedPreferences.Editor editor =
                PreferenceManager.getDefaultSharedPreferences(MainActivity.Context).edit();
        editor.putInt(NameData, value);
        editor.apply();
    }

    //lay ra
    public static int GetDataTypeNumberByName(String NameData, int ValueDefault){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(MainActivity.Context);
        int value = sp.getInt(NameData, ValueDefault);
        return value;
    }
    //luu kieu
    public static void SaveDataTypeStringByName(String NameData, String value){
        SharedPreferences.Editor editor =
                PreferenceManager.getDefaultSharedPreferences(MainActivity.Context).edit();
        editor.putString(NameData, value);
        editor.apply();
    }

    public static String GetDataTypeStringByName(String NameData, String ValueDefault){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(MainActivity.Context);
        String value = sp.getString(NameData, ValueDefault);
        return value;
    }
}
