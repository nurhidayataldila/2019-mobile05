package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandstandFragment;
import polinema.ac.id.starterchapter05.fragments.PushupsFragment;

public class TugasFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_fragment);
    }

    public void handlerClickHandstandFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.dynamic_fragment_placeholder);

        if(fragment == null || fragment instanceof DipsFragment || fragment instanceof PushupsFragment) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new HandstandFragment(),"HANDSTAND_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void handlerClickDipsFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.dynamic_fragment_placeholder);

        if(fragment == null || fragment instanceof HandstandFragment || fragment instanceof PushupsFragment) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new DipsFragment(),"DIPS_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void handlerClickPushupsFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.dynamic_fragment_placeholder);

        if(fragment == null || fragment instanceof HandstandFragment || fragment instanceof DipsFragment) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new PushupsFragment(),"PUSHUPS_FRAGMENT");
            fragmentTransaction.commit();
        }
    }
}
