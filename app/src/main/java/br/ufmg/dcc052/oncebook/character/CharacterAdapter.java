package br.ufmg.dcc052.oncebook.character;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by xavier on 6/6/16.
 */
public class CharacterAdapter extends BaseAdapter {

  private Context context;

  public CharacterAdapter(Context c) {
    this.context = c;
  }

  @Override
  public int getCount() {
    return 0;
  }

  @Override
  public Object getItem(int position) {
    return null;
  }

  @Override
  public long getItemId(int position) {
    return 0;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    return null;
  }
}