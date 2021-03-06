package com.phelat.navigationresult

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

fun Fragment.navigateUp(requestCode: Int, bundle: Bundle) {
    (activity as? FragmentResultActivity)?.setBundle(requestCode, bundle)
        ?: throw IllegalStateException("You need to extend your activity from FragmentResultActivity")
    findNavController().navigateUp()
}
