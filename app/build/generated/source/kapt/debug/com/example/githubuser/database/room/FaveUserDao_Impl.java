package com.example.githubuser.database.room;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.githubuser.database.entity.FaveUser;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FaveUserDao_Impl implements FaveUserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FaveUser> __insertionAdapterOfFaveUser;

  private final EntityDeletionOrUpdateAdapter<FaveUser> __deletionAdapterOfFaveUser;

  public FaveUserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFaveUser = new EntityInsertionAdapter<FaveUser>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `fave_user` (`login`,`avatar_img`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FaveUser value) {
        if (value.getLogin() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getLogin());
        }
        if (value.getAvatarImgUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAvatarImgUrl());
        }
      }
    };
    this.__deletionAdapterOfFaveUser = new EntityDeletionOrUpdateAdapter<FaveUser>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `fave_user` WHERE `login` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FaveUser value) {
        if (value.getLogin() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getLogin());
        }
      }
    };
  }

  @Override
  public void insert(final FaveUser faveUser) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFaveUser.insert(faveUser);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final FaveUser faveUser) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfFaveUser.handle(faveUser);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<FaveUser>> getAllFaveUser() {
    final String _sql = "SELECT * FROM fave_user";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"fave_user"}, false, new Callable<List<FaveUser>>() {
      @Override
      public List<FaveUser> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfLogin = CursorUtil.getColumnIndexOrThrow(_cursor, "login");
          final int _cursorIndexOfAvatarImgUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar_img");
          final List<FaveUser> _result = new ArrayList<FaveUser>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FaveUser _item;
            _item = new FaveUser();
            final String _tmpLogin;
            if (_cursor.isNull(_cursorIndexOfLogin)) {
              _tmpLogin = null;
            } else {
              _tmpLogin = _cursor.getString(_cursorIndexOfLogin);
            }
            _item.setLogin(_tmpLogin);
            final String _tmpAvatarImgUrl;
            if (_cursor.isNull(_cursorIndexOfAvatarImgUrl)) {
              _tmpAvatarImgUrl = null;
            } else {
              _tmpAvatarImgUrl = _cursor.getString(_cursorIndexOfAvatarImgUrl);
            }
            _item.setAvatarImgUrl(_tmpAvatarImgUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<FaveUser> getFaveUserByLogin(final String login) {
    final String _sql = "SELECT * FROM fave_user WHERE login = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (login == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, login);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"fave_user"}, false, new Callable<FaveUser>() {
      @Override
      public FaveUser call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfLogin = CursorUtil.getColumnIndexOrThrow(_cursor, "login");
          final int _cursorIndexOfAvatarImgUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar_img");
          final FaveUser _result;
          if(_cursor.moveToFirst()) {
            _result = new FaveUser();
            final String _tmpLogin;
            if (_cursor.isNull(_cursorIndexOfLogin)) {
              _tmpLogin = null;
            } else {
              _tmpLogin = _cursor.getString(_cursorIndexOfLogin);
            }
            _result.setLogin(_tmpLogin);
            final String _tmpAvatarImgUrl;
            if (_cursor.isNull(_cursorIndexOfAvatarImgUrl)) {
              _tmpAvatarImgUrl = null;
            } else {
              _tmpAvatarImgUrl = _cursor.getString(_cursorIndexOfAvatarImgUrl);
            }
            _result.setAvatarImgUrl(_tmpAvatarImgUrl);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
