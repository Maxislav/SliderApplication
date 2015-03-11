package com.example.mars.sliderapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

public class ScreenSlidePageFragment extends Fragment {

    final static String CLASS_NAME = "ScreenSlidePageFragment log";

    /**
     * The argument key for the page number this fragment represents.
     */
    public static final String ARG_PAGE = "page";

    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
     */
    private int mPageNumber;

    /**
     * Factory method for this fragment class. Constructs a new fragment for the given page number.
     */
    public static ScreenSlidePageFragment create(int pageNumber) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public ScreenSlidePageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout containing a title and body text.
        ViewGroup rootView;
        WebView browser;
        Log.d(CLASS_NAME, mPageNumber + "");
        switch (mPageNumber){
            case 0:

                rootView = (ViewGroup) inflater.inflate(R.layout.fragment_screen_slide_page0, container, false);
                ((TextView) rootView.findViewById(android.R.id.text1)).setText(getString(R.string.title_template_step, mPageNumber + 1));
                browser = (WebView) rootView.findViewById(R.id.webview);
                browser.loadDataWithBaseURL("file:///android_asset/", getString(R.string.lorem_ipsum0), "text/html", "utf-8", null);
                break;
            case 1:

                rootView = (ViewGroup) inflater.inflate(R.layout.fragment_screen_slide_page0, container, false);
                ((TextView) rootView.findViewById(android.R.id.text1)).setText(getString(R.string.title_template_step, mPageNumber + 1));
                browser = (WebView) rootView.findViewById(R.id.webview);
                browser.loadDataWithBaseURL("file:///android_asset/", getString(R.string.lorem_ipsum1), "text/html", "utf-8", null);
                break;
            case 2:

                rootView = (ViewGroup) inflater.inflate(R.layout.fragment_screen_slide_page0, container, false);
                ((TextView) rootView.findViewById(android.R.id.text1)).setText(getString(R.string.title_template_step, mPageNumber + 1));
                browser = (WebView) rootView.findViewById(R.id.webview);
                browser.loadDataWithBaseURL("file:///android_asset/", getString(R.string.lorem_ipsum2), "text/html", "utf-8", null);
                break;
            case 3:

                rootView = (ViewGroup) inflater.inflate(R.layout.fragment_screen_slide_page0, container, false);
                ((TextView) rootView.findViewById(android.R.id.text1)).setText(getString(R.string.title_template_step, mPageNumber + 1));
                browser = (WebView) rootView.findViewById(R.id.webview);
                browser.loadDataWithBaseURL("file:///android_asset/", getString(R.string.lorem_ipsum3), "text/html", "utf-8", null);
                break;

            default:
                rootView = (ViewGroup) inflater.inflate(R.layout.fragment_screen_slide_page, container, false);
                ((TextView) rootView.findViewById(android.R.id.text1)).setText(getString(R.string.title_template_step, mPageNumber + 1));
               // browser = (WebView) rootView.findViewById(R.id.webview);
              //  browser.loadDataWithBaseURL("file:///android_asset/", getString(R.string.lorem_ipsum0), "text/html", "utf-8", null);

        }





        return rootView;
    }

    /**
     * Returns the page number represented by this fragment object.
     */
    public int getPageNumber() {
        return mPageNumber;
    }
}