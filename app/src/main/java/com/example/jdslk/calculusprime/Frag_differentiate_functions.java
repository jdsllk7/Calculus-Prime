package com.example.jdslk.calculusprime;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Frag_differentiate_functions extends Fragment {

    /*******Relative Layouts of Expressions******/
    private MiddleMan_Interface middleMan_interface;
    private RelativeLayout coreEqu_cover;
    private TextView rad_deg_text_view;
    private RelativeLayout cos;
    private RelativeLayout sin;
    private RelativeLayout tan;
    private RelativeLayout cot;
    private RelativeLayout sec;
    private RelativeLayout csc;
    private RelativeLayout any_root;
    private RelativeLayout power;
    private RelativeLayout log_base;
    private RelativeLayout squared;
    private RelativeLayout square_root;
    private RelativeLayout e;
    private RelativeLayout ln;
    private RelativeLayout log_ten;
    private RelativeLayout divide;

    /**Equation EditText Boxes for User Input**/
    private EditText coreEqu;
    private EditText cos_box;
    private EditText sin_box;
    private EditText tan_box;
    private EditText cot_box;
    private EditText csc_box;
    private EditText sec_box;
    private EditText pre_any_root_box;
    private EditText post_any_root_box;
    private EditText superScript_box;
    private EditText power_box;
    private EditText superScript;
    private EditText log_base_box;
    private EditText squared_box;
    private EditText square_root_box;
    private EditText e_box;
    private EditText ln_box;
    private EditText log_ten_box;
    private EditText denominator_box;
    private EditText numerator_box;
    private EditText log_base_constant;
    private EditText any_root_constant;
    private EditText square_root_constant;
    private EditText e_constant;
    private EditText ln_constant;
    private EditText log_ten_constant;
    private EditText cos_constant;
    private EditText sin_constant;
    private EditText tan_constant;
    private EditText csc_constant;
    private EditText sec_constant;
    private EditText cot_constant;
    private EditText constant;
    private EditText dydx_denominator;
    private EditText temp_Editor_backspace = null;
    private TextView clear_screen;

    /**Other Variables*/
    private String currentEquation = "coreEqu";
    private int proceed_count = 0;
    private int empty_proceed_count = 0;


    /**
     *
     */
    @SuppressLint("ValidFragment")
    protected Frag_differentiate_functions() {
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        middleMan_interface = (MiddleMan_Interface)activity;
    }//end onAttach()


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainActivity = inflater.inflate(R.layout.frag_differentiate_functions, container, false);


        /**Linking any other views & variables**/
        rad_deg_text_view = mainActivity.findViewById(R.id.rad_deg_text_view);
        clear_screen = mainActivity.findViewById(R.id.clear_screen);


        /**UI RelativeLayout - Variable for each MATH Function**/
        coreEqu_cover = mainActivity.findViewById(R.id.coreEqu_cover);
        cos = mainActivity.findViewById(R.id.cos);
        sin = mainActivity.findViewById(R.id.sin);
        tan = mainActivity.findViewById(R.id.tan);
        cot = mainActivity.findViewById(R.id.cot);
        csc = mainActivity.findViewById(R.id.csc);
        sec = mainActivity.findViewById(R.id.sec);
        any_root = mainActivity.findViewById(R.id.any_root);
        power = mainActivity.findViewById(R.id.power);
        log_base = mainActivity.findViewById(R.id.log_base);
        squared = mainActivity.findViewById(R.id.squared);
        square_root = mainActivity.findViewById(R.id.square_root);
        e = mainActivity.findViewById(R.id.e);
        ln = mainActivity.findViewById(R.id.ln);
        log_ten = mainActivity.findViewById(R.id.log_ten);
        divide = mainActivity.findViewById(R.id.divide);


        /**Equation EditText Boxes for User Input**/
        coreEqu = mainActivity.findViewById(R.id.coreEqu);
        cos_box = mainActivity.findViewById(R.id.cos_box);
        sin_box = mainActivity.findViewById(R.id.sin_box);
        tan_box = mainActivity.findViewById(R.id.tan_box);
        cot_box = mainActivity.findViewById(R.id.cot_box);
        csc_box = mainActivity.findViewById(R.id.csc_box);
        sec_box = mainActivity.findViewById(R.id.sec_box);
        pre_any_root_box = mainActivity.findViewById(R.id.pre_any_root_box);
        post_any_root_box = mainActivity.findViewById(R.id.post_any_root_box);
        superScript_box = mainActivity.findViewById(R.id.superScript_box);
        power_box = mainActivity.findViewById(R.id.power_box);
        superScript = mainActivity.findViewById(R.id.superScript);
        log_base_box = mainActivity.findViewById(R.id.log_base_box);
        squared_box = mainActivity.findViewById(R.id.squared_box);
        square_root_box = mainActivity.findViewById(R.id.square_root_box);
        e_box = mainActivity.findViewById(R.id.e_box);
        ln_box = mainActivity.findViewById(R.id.ln_box);
        log_ten_box = mainActivity.findViewById(R.id.log_ten_box);
        denominator_box = mainActivity.findViewById(R.id.denominator_box);
        numerator_box = mainActivity.findViewById(R.id.numerator_box);
        any_root_constant = mainActivity.findViewById(R.id.any_root_constant);
        log_base_constant = mainActivity.findViewById(R.id.log_base_constant);
        square_root_constant = mainActivity.findViewById(R.id.square_root_constant);
        e_constant = mainActivity.findViewById(R.id.e_constant);
        ln_constant = mainActivity.findViewById(R.id.ln_constant);
        log_ten_constant = mainActivity.findViewById(R.id.log_ten_constant);
        sin_constant = mainActivity.findViewById(R.id.sin_constant);
        tan_constant = mainActivity.findViewById(R.id.tan_constant);
        cos_constant = mainActivity.findViewById(R.id.cos_constant);
        sec_constant = mainActivity.findViewById(R.id.sec_constant);
        cot_constant = mainActivity.findViewById(R.id.cot_constant);
        csc_constant = mainActivity.findViewById(R.id.csc_constant);
        constant = mainActivity.findViewById(R.id.constant);
        dydx_denominator = mainActivity.findViewById(R.id.dydx_denominator);



        /**EditText Boxes NO Popup Soft-keypad**/
        coreEqu.setInputType(InputType.TYPE_NULL);
        cos_box.setInputType(InputType.TYPE_NULL);
        sin_box.setInputType(InputType.TYPE_NULL);
        tan_box.setInputType(InputType.TYPE_NULL);
        cot_box.setInputType(InputType.TYPE_NULL);
        csc_box.setInputType(InputType.TYPE_NULL);
        sec_box.setInputType(InputType.TYPE_NULL);
        pre_any_root_box.setInputType(InputType.TYPE_NULL);
        post_any_root_box.setInputType(InputType.TYPE_NULL);
        superScript_box.setInputType(InputType.TYPE_NULL);
        power_box.setInputType(InputType.TYPE_NULL);
        superScript.setInputType(InputType.TYPE_NULL);
        log_base_box.setInputType(InputType.TYPE_NULL);
        squared_box.setInputType(InputType.TYPE_NULL);
        square_root_box.setInputType(InputType.TYPE_NULL);
        e_box.setInputType(InputType.TYPE_NULL);
        ln_box.setInputType(InputType.TYPE_NULL);
        log_ten_box.setInputType(InputType.TYPE_NULL);
        denominator_box.setInputType(InputType.TYPE_NULL);
        numerator_box.setInputType(InputType.TYPE_NULL);
        any_root_constant.setInputType(InputType.TYPE_NULL);
        log_base_constant.setInputType(InputType.TYPE_NULL);
        square_root_constant.setInputType(InputType.TYPE_NULL);
        e_constant.setInputType(InputType.TYPE_NULL);
        ln_constant.setInputType(InputType.TYPE_NULL);
        log_ten_constant.setInputType(InputType.TYPE_NULL);
        sin_constant.setInputType(InputType.TYPE_NULL);
        tan_constant.setInputType(InputType.TYPE_NULL);
        cos_constant.setInputType(InputType.TYPE_NULL);
        sec_constant.setInputType(InputType.TYPE_NULL);
        cot_constant.setInputType(InputType.TYPE_NULL);
        csc_constant.setInputType(InputType.TYPE_NULL);
        constant.setInputType(InputType.TYPE_NULL);
        dydx_denominator.setInputType(InputType.TYPE_NULL);


        /**EditText Boxes able to select text**/
        coreEqu.setTextIsSelectable(true);
        cos_box.setTextIsSelectable(true);
        sin_box.setTextIsSelectable(true);
        tan_box.setTextIsSelectable(true);
        cot_box.setTextIsSelectable(true);
        csc_box.setTextIsSelectable(true);
        sec_box.setTextIsSelectable(true);
        pre_any_root_box.setTextIsSelectable(true);
        post_any_root_box.setTextIsSelectable(true);
        superScript_box.setTextIsSelectable(true);
        power_box.setTextIsSelectable(true);
        superScript.setTextIsSelectable(true);
        log_base_box.setTextIsSelectable(true);
        squared_box.setTextIsSelectable(true);
        square_root_box.setTextIsSelectable(true);
        e_box.setTextIsSelectable(true);
        ln_box.setTextIsSelectable(true);
        log_ten_box.setTextIsSelectable(true);
        denominator_box.setTextIsSelectable(true);
        numerator_box.setTextIsSelectable(true);
        any_root_constant.setTextIsSelectable(true);
        log_base_constant.setTextIsSelectable(true);
        square_root_constant.setTextIsSelectable(true);
        e_constant.setTextIsSelectable(true);
        ln_constant.setTextIsSelectable(true);
        log_ten_constant.setTextIsSelectable(true);
        sin_constant.setTextIsSelectable(true);
        tan_constant.setTextIsSelectable(true);
        cos_constant.setTextIsSelectable(true);
        sec_constant.setTextIsSelectable(true);
        cot_constant.setTextIsSelectable(true);
        csc_constant.setTextIsSelectable(true);
        constant.setTextIsSelectable(true);
        dydx_denominator.setTextIsSelectable(true);




        /**Initializing some stuff**/
        clear_screen.setText("");
        dydx_denominator.setText("x");




        /**************clear_screen LISTENER***************************/
        clear_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                coreEqu_cover.setVisibility(View.VISIBLE);
                cos.setVisibility(View.GONE);
                sin.setVisibility(View.GONE);
                tan.setVisibility(View.GONE);
                cot.setVisibility(View.GONE);
                sec.setVisibility(View.GONE);
                csc.setVisibility(View.GONE);
                any_root.setVisibility(View.GONE);
                power.setVisibility(View.GONE);
                log_base.setVisibility(View.GONE);
                squared.setVisibility(View.GONE);
                square_root.setVisibility(View.GONE);
                e.setVisibility(View.GONE);
                ln.setVisibility(View.GONE);
                log_ten.setVisibility(View.GONE);
                divide.setVisibility(View.GONE);
                empty_EditText_Boxes();
                clear_screen.setText("");
                currentEquation = "coreEqu";
                middleMan_interface.data_carrier("screen_cleared");
            }
        });



        /********************EditText setOnFocusChangeListeners****************************/

        /**0.1**/
        constant.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        constant.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("constant_focused_gained");
                        temp_Editor_backspace = constant;
                        //monitor lost/gain of focus
                        change_editText_content(constant, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        constant.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("constant_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(constant, false);
                    }//end if()
                }
            }});


        /**0.2**/
        dydx_denominator.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        dydx_denominator.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("dydx_denominator_focused_gained");
                        temp_Editor_backspace = dydx_denominator;
                        //monitor lost/gain of focus
                        change_editText_content(dydx_denominator, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        dydx_denominator.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("dydx_denominator_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(dydx_denominator, false);
                    }//end if()
                }
            }});


        /**1**/
        coreEqu.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        coreEqu.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("coreEqu_focused_gained");
                        temp_Editor_backspace = coreEqu;
                        //monitor lost/gain of focus
                        change_editText_content(coreEqu, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        coreEqu.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("coreEqu_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(coreEqu, false);
                    }//end if()
                }
            }});


        /**2**/
        any_root_constant.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        any_root_constant.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("any_root_constant_focused_gained");
                        temp_Editor_backspace = any_root_constant;
                        //monitor lost/gain of focus
                        change_editText_content(any_root_constant, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        any_root_constant.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("any_root_constant_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(any_root_constant, false);
                    }//end if()
                }
            }});


        /**3**/
        log_base_constant.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        log_base_constant.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("log_base_constant_focused_gained");
                        temp_Editor_backspace = log_base_constant;
                        //monitor lost/gain of focus
                        change_editText_content(log_base_constant, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        log_base_constant.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("log_base_constant_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(log_base_constant, false);
                    }//end if()
                }
            }});


        /**4**/
        square_root_constant.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        square_root_constant.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("square_root_constant_focused_gained");
                        temp_Editor_backspace = square_root_constant;
                        //monitor lost/gain of focus
                        change_editText_content(square_root_constant, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        square_root_constant.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("square_root_constant_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(square_root_constant, false);
                    }//end if()
                }
            }});


        /**5**/
        e_constant.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        e_constant.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("e_constant_focused_gained");
                        temp_Editor_backspace = e_constant;
                        //monitor lost/gain of focus
                        change_editText_content(e_constant, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        e_constant.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("e_constant_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(e_constant, false);
                    }//end if()
                }
            }});


        /**6**/
        ln_constant.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        ln_constant.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("ln_constant_focused_gained");
                        temp_Editor_backspace = ln_constant;
                        //monitor lost/gain of focus
                        change_editText_content(ln_constant, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        ln_constant.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("ln_constant_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(ln_constant, false);
                    }//end if()
                }
            }});


        /**7**/
        log_ten_constant.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        log_ten_constant.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("log_ten_constant_focused_gained");
                        temp_Editor_backspace = log_ten_constant;
                        //monitor lost/gain of focus
                        change_editText_content(log_ten_constant, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        log_ten_constant.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("log_ten_constant_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(log_ten_constant, false);
                    }//end if()
                }
            }});

        /**8**/
        sin_constant.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        sin_constant.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("sin_constant_focused_gained");
                        temp_Editor_backspace = sin_constant;
                        //monitor lost/gain of focus
                        change_editText_content(sin_constant, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        sin_constant.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("sin_constant_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(sin_constant, false);
                    }//end if()
                }
            }});

        /**9**/
        tan_constant.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        tan_constant.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("tan_constant_focused_gained");
                        temp_Editor_backspace = tan_constant;
                        //monitor lost/gain of focus
                        change_editText_content(tan_constant, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        tan_constant.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("tan_constant_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(tan_constant, false);
                    }//end if()
                }
            }});

        /**10**/
        cos_constant.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        cos_constant.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("cos_constant_focused_gained");
                        temp_Editor_backspace = cos_constant;
                        //monitor lost/gain of focus
                        change_editText_content(cos_constant, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        cos_constant.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("cos_constant_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(cos_constant, false);
                    }//end if()
                }
            }});

        /**11**/
        csc_constant.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        csc_constant.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("csc_constant_focused_gained");
                        temp_Editor_backspace = csc_constant;
                        //monitor lost/gain of focus
                        change_editText_content(csc_constant, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        csc_constant.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("csc_constant_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(csc_constant, false);
                    }//end if()
                }
            }});

        /**12**/
        cot_constant.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        cot_constant.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("cot_constant_focused_gained");
                        temp_Editor_backspace = cot_constant;
                        //monitor lost/gain of focus
                        change_editText_content(cot_constant, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        cot_constant.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("cot_constant_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(cot_constant, false);
                    }//end if()
                }
            }});

        /**13**/
        sec_constant.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        sec_constant.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("sec_constant_focused_gained");
                        temp_Editor_backspace = sec_constant;
                        //monitor lost/gain of focus
                        change_editText_content(sec_constant, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        sec_constant.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("sec_constant_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(sec_constant, false);
                    }//end if()
                }
            }});

        /**14**/
        denominator_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        denominator_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("denominator_box_focused_gained");
                        temp_Editor_backspace = denominator_box;
                        //monitor lost/gain of focus
                        change_editText_content(denominator_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        denominator_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("denominator_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(denominator_box, false);
                    }//end if()
                }
            }});

        /**14**/
        numerator_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        numerator_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("numerator_box_focused_gained");
                        temp_Editor_backspace = numerator_box;
                        //monitor lost/gain of focus
                        change_editText_content(numerator_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        numerator_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("numerator_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(numerator_box, false);
                    }//end if()
                }
            }});

        /**15**/
        pre_any_root_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        pre_any_root_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("pre_any_root_box_focused_gained");
                        temp_Editor_backspace = pre_any_root_box;
                        //monitor lost/gain of focus
                        change_editText_content(pre_any_root_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        pre_any_root_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("pre_any_root_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(pre_any_root_box, false);
                    }//end if()
                }
            }});

        /**16**/
        post_any_root_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        post_any_root_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("post_any_root_box_focused_gained");
                        temp_Editor_backspace = post_any_root_box;
                        //monitor lost/gain of focus
                        change_editText_content(post_any_root_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        post_any_root_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("post_any_root_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(post_any_root_box, false);
                    }//end if()
                }
            }});

        /**17**/
        superScript_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        superScript_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("superScript_box_focused_gained");
                        temp_Editor_backspace = superScript_box;
                        //monitor lost/gain of focus
                        change_editText_content(superScript_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        superScript_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("superScript_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(superScript_box, false);
                    }//end if()
                }
            }});

        /**18**/
        power_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        power_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("power_box_focused_gained");
                        temp_Editor_backspace = power_box;
                        //monitor lost/gain of focus
                        change_editText_content(power_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        power_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("power_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(power_box, false);
                    }//end if()
                }
            }});

        /**19**/
        superScript.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        superScript.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("superScript_focused_gained");
                        temp_Editor_backspace = superScript;
                        //monitor lost/gain of focus
                        change_editText_content(superScript, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        superScript.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("superScript_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(superScript, false);
                    }//end if()
                }
            }});

        /**20**/
        log_base_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        log_base_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("log_base_box_focused_gained");
                        temp_Editor_backspace = log_base_box;
                        //monitor lost/gain of focus
                        change_editText_content(log_base_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        log_base_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("log_base_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(log_base_box, false);
                    }//end if()
                }
            }});

        /**21**/
        squared_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        squared_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("squared_box_focused_gained");
                        temp_Editor_backspace = squared_box;
                        //monitor lost/gain of focus
                        change_editText_content(squared_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        squared_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("squared_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(squared_box, false);
                    }//end if()
                }
            }});

        /**22**/
        square_root_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        square_root_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("square_root_box_focused_gained");
                        temp_Editor_backspace = square_root_box;
                        //monitor lost/gain of focus
                        change_editText_content(square_root_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        square_root_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("square_root_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(square_root_box, false);
                    }//end if()
                }
            }});

        /**23**/
        e_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        e_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("e_box_focused_gained");
                        temp_Editor_backspace = e_box;
                        //monitor lost/gain of focus
                        change_editText_content(e_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        e_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("e_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(e_box, false);
                    }//end if()
                }
            }});

        /**24**/
        ln_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        ln_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("ln_box_focused_gained");
                        temp_Editor_backspace = ln_box;
                        //monitor lost/gain of focus
                        change_editText_content(ln_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        ln_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("ln_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(ln_box, false);
                    }//end if()
                }
            }});

        /**25**/
        log_ten_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        log_ten_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("log_ten_box_focused_gained");
                        temp_Editor_backspace = log_ten_box;
                        //monitor lost/gain of focus
                        change_editText_content(log_ten_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        log_ten_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("log_ten_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(log_ten_box, false);
                    }//end if()
                }
            }});

        /**26**/
        cos_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        cos_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("cos_box_focused_gained");
                        temp_Editor_backspace = cos_box;
                        //monitor lost/gain of focus
                        change_editText_content(cos_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        cos_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("cos_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(cos_box, false);
                    }//end if()
                }
            }});

        /**27**/
        sin_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        sin_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("sin_box_focused_gained");
                        temp_Editor_backspace = sin_box;
                        //monitor lost/gain of focus
                        change_editText_content(sin_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        sin_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("sin_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(sin_box, false);
                    }//end if()
                }
            }});

        /**28**/
        tan_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        tan_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("tan_box_focused_gained");
                        temp_Editor_backspace = tan_box;
                        //monitor lost/gain of focus
                        change_editText_content(tan_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        tan_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("tan_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(tan_box, false);
                    }//end if()
                }
            }});

        /**29**/
        sec_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        sec_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("sec_box_focused_gained");
                        temp_Editor_backspace = sec_box;
                        //monitor lost/gain of focus
                        change_editText_content(sec_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        sec_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("sec_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(sec_box, false);
                    }//end if()
                }
            }});

        /**30**/
        cot_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        cot_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("cot_box_focused_gained");
                        temp_Editor_backspace = cot_box;
                        //monitor lost/gain of focus
                        change_editText_content(cot_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        cot_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("cot_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(cot_box, false);
                    }//end if()
                }
            }});

        /**31**/
        csc_box.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    if(middleMan_interface != null) {
                        csc_box.setBackgroundResource(R.drawable.edit_text_field_styling_on_focus);
                        middleMan_interface.data_carrier("csc_box_focused_gained");
                        temp_Editor_backspace = csc_box;
                        //monitor lost/gain of focus
                        change_editText_content(csc_box, true);
                    }//end if()
                } else {
                    if (middleMan_interface != null) {
                        csc_box.setBackgroundResource(R.drawable.edit_text_field_styling);
                        middleMan_interface.data_carrier("csc_box_focused_lost");
                        temp_Editor_backspace = null;
                        //monitor lost/gain of focus
                        change_editText_content(csc_box, false);
                    }//end if()
                }
            }});


        return mainActivity;
    }//end onCreateView()





    /*****************Method to Show Change of data in EditTexts via Focus or Key-pressed***********************/
    @SuppressLint("SetTextI18n")
    private void change_editText_content(EditText editText, boolean focus){

        String textEditText = editText + "";

        if(editText.getText().toString().equals("") && focus){
            editText.setHint("       ");
            //editText.getBackground().setColorFilter(Color.parseColor("#cce5ff"), PorterDuff.Mode.SRC_ATOP);
        }else if((textEditText.contains("constant") ||  editText.equals(superScript_box) || editText.equals(pre_any_root_box) ||  editText.equals(superScript)) && (editText.getText().toString().equals("") && !focus)){
            editText.setHint("  2  ");
        }else if(editText.equals(dydx_denominator) && editText.getText().toString().equals("") && !focus){
            editText.setHint("  x  ");
        }else if(editText.getText().toString().equals("") && !focus){
            editText.setHint("  2x  ");
        }

    }//end change_editText_content()





    /***************This Method CHANGES THE UI & inserts characters in EditText - upon the click of a button from keypad fragment*******/
    @SuppressLint("SetTextI18n")
    void change_data(String data){

        String tempText;

        switch (data) {

            case "test_before_solve":
                switch (currentEquation) {
                    case "coreEqu": coreEqu_pre_Solve(); break;

                    case "cos": cos_pre_Solve(); break;

                    case "sin": sin_pre_Solve(); break;

                    case "tan": tan_pre_Solve(); break;

                    case "cot": cot_pre_Solve(); break;

                    case "sec": sec_pre_Solve(); break;

                    case "csc": csc_pre_Solve(); break;

                    case "any_root": any_root_pre_Solve(); break;

                    case "power": power_pre_Solve(); break;

                    case "log_base": log_base_pre_Solve(); break;

                    case "squared": squared_pre_Solve(); break;

                    case "square_root": square_root_pre_Solve(); break;

                    case "e": e_pre_Solve(); break;

                    case "ln": ln_pre_Solve(); break;

                    case "log_ten": log_ten_pre_Solve(); break;

                    case "divide": divide_pre_Solve(); break;

                }//end inner Switch
                break;

            case "zero":
                tempText = temp_Editor_backspace.getText().toString() + "0";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;

            case "one":
                tempText = temp_Editor_backspace.getText().toString() + "1";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;

            case "two":
                tempText = temp_Editor_backspace.getText().toString() + "2";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;

            case "three":
                tempText = temp_Editor_backspace.getText().toString() + "3";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;

            case "four":
                tempText = temp_Editor_backspace.getText().toString() + "4";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;

            case "five":
                tempText = temp_Editor_backspace.getText().toString() + "5";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;

            case "six":
                tempText = temp_Editor_backspace.getText().toString() + "6";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;

            case "seven":
                tempText = temp_Editor_backspace.getText().toString() + "7";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;

            case "eight":
                tempText = temp_Editor_backspace.getText().toString() + "8";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;

            case "nine":
                tempText = temp_Editor_backspace.getText().toString() + "9";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;

            case "x":
                tempText = temp_Editor_backspace.getText().toString() + "x";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;

            case "decimal":
                tempText = temp_Editor_backspace.getText().toString() + ".";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;

            case "division":
                tempText = temp_Editor_backspace.getText().toString() + "÷";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;

            case "plus":
                tempText = temp_Editor_backspace.getText().toString() + "+";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;

            case "multiply":
                tempText = temp_Editor_backspace.getText().toString() + "*";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;

            case "minus":
                tempText = temp_Editor_backspace.getText().toString() + "-";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;

            case "pie":
                tempText = temp_Editor_backspace.getText().toString() + "π";
                temp_Editor_backspace.setText(tempText);
                clear_screen.setText("clear");
                break;


            case "rad_deg_button_clicked":
                if (rad_deg_text_view.getText().equals("rad")) {
                    rad_deg_text_view.setText("deg");
                } else if (rad_deg_text_view.getText().equals("deg")) {
                    rad_deg_text_view.setText("rad");
                }
                break;

            case "cos":
                currentEquation = "cos";
                cos.setVisibility(View.VISIBLE);
                coreEqu_cover.setVisibility(View.GONE);
                empty_EditText_Boxes();
                clear_screen.setText("clear");
                break;

            case "sin":
                currentEquation = "sin";
                sin.setVisibility(View.VISIBLE);
                coreEqu_cover.setVisibility(View.GONE);
                empty_EditText_Boxes();
                clear_screen.setText("clear");
                break;

            case "tan":
                currentEquation = "tan";
                tan.setVisibility(View.VISIBLE);
                coreEqu_cover.setVisibility(View.GONE);
                empty_EditText_Boxes();
                clear_screen.setText("clear");
                break;

            case "cot":
                currentEquation = "cot";
                cot.setVisibility(View.VISIBLE);
                coreEqu_cover.setVisibility(View.GONE);
                empty_EditText_Boxes();
                clear_screen.setText("clear");
                break;

            case "sec":
                currentEquation = "sec";
                sec.setVisibility(View.VISIBLE);
                coreEqu_cover.setVisibility(View.GONE);
                empty_EditText_Boxes();
                clear_screen.setText("clear");
                break;

            case "csc":
                currentEquation = "csc";
                csc.setVisibility(View.VISIBLE);
                coreEqu_cover.setVisibility(View.GONE);
                empty_EditText_Boxes();
                clear_screen.setText("clear");
                break;

            case "any_root":
                currentEquation = "any_root";
                any_root.setVisibility(View.VISIBLE);
                coreEqu_cover.setVisibility(View.GONE);
                empty_EditText_Boxes();
                clear_screen.setText("clear");
                break;

            case "power":
                currentEquation = "power";
                power.setVisibility(View.VISIBLE);
                coreEqu_cover.setVisibility(View.GONE);
                empty_EditText_Boxes();
                clear_screen.setText("clear");
                break;

            case "log_base":
                currentEquation = "log_base";
                log_base.setVisibility(View.VISIBLE);
                coreEqu_cover.setVisibility(View.GONE);
                empty_EditText_Boxes();
                clear_screen.setText("clear");
                break;

            case "squared":
                currentEquation = "squared";
                squared.setVisibility(View.VISIBLE);
                coreEqu_cover.setVisibility(View.GONE);
                empty_EditText_Boxes();
                clear_screen.setText("clear");
                break;

            case "square_root":
                currentEquation = "square_root";
                square_root.setVisibility(View.VISIBLE);
                coreEqu_cover.setVisibility(View.GONE);
                empty_EditText_Boxes();
                clear_screen.setText("clear");
                break;

            case "e":
                currentEquation = "e";
                e.setVisibility(View.VISIBLE);
                coreEqu_cover.setVisibility(View.GONE);
                empty_EditText_Boxes();
                clear_screen.setText("clear");
                break;

            case "ln":
                currentEquation = "ln";
                ln.setVisibility(View.VISIBLE);
                coreEqu_cover.setVisibility(View.GONE);
                empty_EditText_Boxes();
                clear_screen.setText("clear");
                break;

            case "log_ten":
                currentEquation = "log_ten";
                log_ten.setVisibility(View.VISIBLE);
                coreEqu_cover.setVisibility(View.GONE);
                empty_EditText_Boxes();
                clear_screen.setText("clear");
                break;

            case "divide":
                currentEquation = "divide";
                divide.setVisibility(View.VISIBLE);
                coreEqu_cover.setVisibility(View.GONE);
                empty_EditText_Boxes();
                clear_screen.setText("clear");
                break;

            case "backspace":
                if(temp_Editor_backspace.length()!=0 && !(temp_Editor_backspace == null)) {
                    temp_Editor_backspace.setText(temp_Editor_backspace.getText().delete(temp_Editor_backspace.length() - 1, temp_Editor_backspace.length()));

                    if(temp_Editor_backspace.equals(dydx_denominator) && temp_Editor_backspace.getText().toString().equals("")){
                        temp_Editor_backspace.setHint("      ");
                        temp_Editor_backspace.setText("");
                    }
                }
                break;

        }//end switch()

    }//end change_data()




    /********************************Empty_EditText_Boxes*********************************/
    private void empty_EditText_Boxes(){

        csc_box.setText("");
        csc_box.setHint("  2x  ");

        cot_box.setText("");
        cot_box.setHint("  2x  ");

        sec_box.setText("");
        sec_box.setHint("  2x  ");

        tan_box.setText("");
        tan_box.setHint("  2x  ");

        sin_box.setText("");
        sin_box.setHint("  2x  ");

        cos_box.setText("");
        cos_box.setHint("  2x  ");

        log_ten_box.setText("");
        log_ten_box.setHint("  2x  ");

        ln_box.setText("");
        ln_box.setHint("  2x  ");

        e_box.setText("");
        e_box.setHint("  2x  ");

        square_root_box.setText("");
        square_root_box.setHint("  2x  ");

        squared_box.setText("");
        squared_box.setHint("  2x  ");

        log_base_box.setText("");
        log_base_box.setHint("  2  ");

        superScript.setText("");
        superScript.setHint("  2  ");

        power_box.setText("");
        power_box.setHint("  2x  ");

        superScript_box.setText("");
        superScript_box.setHint("  2  ");

        post_any_root_box.setText("");
        post_any_root_box.setHint("  2x  ");

        pre_any_root_box.setText("");
        pre_any_root_box.setHint("  2  ");

        numerator_box.setText("");
        numerator_box.setHint("  2x  ");

        denominator_box.setText("");
        denominator_box.setHint("  3x ");

        coreEqu.setText("");
        coreEqu.setHint("  2x  ");

        log_base_constant.setText("");
        log_base_constant.setHint("  2  ");

        any_root_constant.setText("");
        any_root_constant.setHint("  2  ");

        square_root_constant.setText("");
        square_root_constant.setHint("  2  ");

        e_constant.setText("");
        e_constant.setHint("  2  ");

        ln_constant.setText("");
        ln_constant.setHint("  2  ");

        log_ten_constant.setText("");
        log_ten_constant.setHint("  2  ");

        cos_constant.setText("");
        cos_constant.setHint("  2  ");

        sin_constant.setText("");
        sin_constant.setHint("  2  ");

        tan_constant.setText("");
        tan_constant.setHint("  2  ");

        csc_constant.setText("");
        csc_constant.setHint("  2  ");

        sec_constant.setText("");
        sec_constant.setHint("  2  ");

        cot_constant.setText("");
        cot_constant.setHint("  2  ");

        constant.setText("");
        constant.setHint("  2  ");

        dydx_denominator.setText("");
        dydx_denominator.setHint("  x  ");

        dydx_denominator.setText("x");

    }//end empty_EditText_Boxes()






    /**********************************DOWN HERE WE ARE TESTING************************************/
    /**********************************DOWN HERE WE ARE TESTING************************************/
    /**********************************DOWN HERE WE ARE TESTING************************************/
    /**********************************DOWN HERE WE ARE TESTING************************************/
    /**********************************DOWN HERE WE ARE TESTING************************************/




    /******************************POPUP WHEN SOMETHING'S WRONG***********************************/
    private void popup_dialog(String title, String msg){

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setCancelable(false);
        builder.setTitle(title);
        builder.setMessage(msg);

        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.create().show();

    }//end popup_dialog()




    /******************************double checking content of [2x] edittexts***********************/
    private void verify_editText_2x_equ(String content){

        char [] charsArray = content.toCharArray();
        int counting = 0;
        for (char aChar : charsArray) {
            if (aChar == 'x') {
                counting++;
            }
        }//end for()

        if ( counting>1 || (content.contains("x") && content.charAt(content.length()-1)!='x') || content.charAt(0)=='.' || ((content.contains(".") && content.charAt(content.length()-1)=='.')) || content.substring(1).contains("+") || content.substring(1).contains("-") || content.contains("*") || content.contains("÷") || content.equals(".") || content.equals("") || content.equals("+") || content.equals("-")){
            proceed_count++;
        }

    }//end verify_editText_2x_equ()




    /**************************double checking content of constants [2] edittext******************/
    private void verify_editText_constants(String content){

            if (content.equals("+") || content.equals("-") || (content.contains(".") && content.charAt(content.length()-1)=='.') || content.charAt(0) == '.' || content.contains("x") || content.contains("*") || content.contains("÷") || content.substring(1).contains("+") || content.substring(1).contains("-") || content.equals(".")) {
                proceed_count++;
        }

    }//end verify_editText_constants()





    /**********************double checking content of logBases_powers_squares edittext**************/
    private void verify_editText_logBases_powers_squares(String content){

        if(content.contains(".") || content.contains("x") || content.contains("*") || content.contains("÷") || content.contains("+") || content.contains("-") ||content.contains("π")){
            proceed_count++;
        }

    }//end verify_editText_logBases_powers_squares()





    /***********************double checking content of dydx_denominator edittext********************/
    private void verify_editText_dydx_denominator(String content){

        if(!content.equals("x") || content.equals("")){
            //Toast.makeText(getContext(),"Toasting dy/dx", Toast.LENGTH_SHORT).show();
            proceed_count++;
        }

    }//end verify_editText_dydx_denominator()




    /******************************SOLVE Differential of coreEqu****************************************/
    private void coreEqu_pre_Solve() {
        String content;
        //Toast.makeText(getContext(),"Toasting: "+proceed_count, Toast.LENGTH_SHORT).show();

        /**get & check content of main constant**/
        content = constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = dydx_denominator.getText().toString();
        if(!content.equals("")) {
            verify_editText_dydx_denominator(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of coreEqu**/
        content = coreEqu.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        if (proceed_count>0 || empty_proceed_count>0) {
            popup_dialog("Syntax Error", "Invalid entry");
            proceed_count = 0;
            empty_proceed_count = 0;
        } else {
            coreEqu_Solving(constant.getText().toString(),coreEqu.getText().toString());
        }

    }//end coreEqu_pre_Solve()




    /********************************SOLVE Differential of cos************************************/
    private void cos_pre_Solve(){
        String content;

        /**get & check content of main constant**/
        content = constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = dydx_denominator.getText().toString();
        if(!content.equals("")) {
            verify_editText_dydx_denominator(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of editText**/
        content = cos_constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = cos_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        if (proceed_count>0 || empty_proceed_count>0) {
            popup_dialog("Syntax Error", "Invalid entry");
            proceed_count = 0;
            empty_proceed_count = 0;
        } else {

            cos_Solving(constant.getText().toString(),cos_constant.getText().toString(),cos_box.getText().toString());
        }


    }//end cos_pre_Solve()





    /********************************SOLVE Differential of sin************************************/
    private void sin_pre_Solve(){
        String content;

        /**get & check content of main constant**/
        content = constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = dydx_denominator.getText().toString();
        if(!content.equals("")) {
            verify_editText_dydx_denominator(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of editText**/
        content = sin_constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = sin_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        if (proceed_count>0 || empty_proceed_count>0) {
            popup_dialog("Syntax Error", "Invalid entry");
            proceed_count = 0;
            empty_proceed_count = 0;
        } else {
            sin_Solving(constant.getText().toString(),sin_constant.getText().toString(),sin_box.getText().toString());
        }


    }//end sin_pre_Solve()






    /********************************SOLVE Differential of tan************************************/
    private void tan_pre_Solve(){
        String content;

        /**get & check content of main constant**/
        content = constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = dydx_denominator.getText().toString();
        if(!content.equals("")) {
            verify_editText_dydx_denominator(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of editText**/
        content = tan_constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = tan_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        if (proceed_count>0 || empty_proceed_count>0) {
            popup_dialog("Syntax Error", "Invalid entry");
            proceed_count = 0;
            empty_proceed_count = 0;
            return;
        } else {
            tan_Solving(constant.getText().toString(),tan_constant.getText().toString(),tan_box.getText().toString());
        }

    }//end tan_pre_Solve()






    /********************************SOLVE Differential of csc************************************/
    private void csc_pre_Solve(){
        String content;

        /**get & check content of main constant**/
        content = constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = dydx_denominator.getText().toString();
        if(!content.equals("")) {
            verify_editText_dydx_denominator(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of editText**/
        content = csc_constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = csc_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        if (proceed_count>0 || empty_proceed_count>0) {
            popup_dialog("Syntax Error", "Invalid entry");
            proceed_count = 0;
            empty_proceed_count = 0;
            return;
        } else {
            csc_Solving(constant.getText().toString(),csc_constant.getText().toString(),csc_box.getText().toString());
        }


    }//end csc_pre_Solve()





    /********************************SOLVE Differential of sec************************************/
    private void sec_pre_Solve(){
        String content;

        /**get & check content of main constant**/
        content = constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = dydx_denominator.getText().toString();
        if(!content.equals("")) {
            verify_editText_dydx_denominator(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of editText**/
        content = sec_constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = sec_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        if (proceed_count>0 || empty_proceed_count>0) {
            popup_dialog("Syntax Error", "Invalid entry");
            proceed_count = 0;
            empty_proceed_count = 0;
        } else {
            sec_Solving(constant.getText().toString(),sec_constant.getText().toString(),sec_box.getText().toString());
        }

    }//end sec_pre_Solve()





    /********************************SOLVE Differential of cot************************************/
    private void cot_pre_Solve(){
        String content;

        /**get & check content of main constant**/
        content = constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = dydx_denominator.getText().toString();
        if(!content.equals("")) {
            verify_editText_dydx_denominator(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of editText**/
        content = cot_constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = cot_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        if (proceed_count>0 || empty_proceed_count>0) {
            popup_dialog("Syntax Error", "Invalid entry");
            proceed_count = 0;
            empty_proceed_count = 0;
            return;
        } else {
            cot_Solving(constant.getText().toString(),cot_constant.getText().toString(),cot_box.getText().toString());
        }


    }//end cot_pre_Solve()





    /********************************SOLVE Differential of ln************************************/
    private void ln_pre_Solve(){
        String content;

        /**get & check content of main constant**/
        content = constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = dydx_denominator.getText().toString();
        if(!content.equals("")) {
            verify_editText_dydx_denominator(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of editText**/
        content = ln_constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = ln_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        if (proceed_count>0 || empty_proceed_count>0) {
            popup_dialog("Syntax Error", "Invalid entry");
            proceed_count = 0;
            empty_proceed_count = 0;
        } else {
            popup_dialog("Subscription", "Please Subscribe to unlocked premium feature.");
        }

    }//end ln_pre_Solve()






    /********************************SOLVE Differential of e************************************/
    private void e_pre_Solve(){
        String content;

        /**get & check content of main constant**/
        content = constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = dydx_denominator.getText().toString();
        if(!content.equals("")) {
            verify_editText_dydx_denominator(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of editText**/
        content = e_constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = e_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

       if (proceed_count>0 || empty_proceed_count>0) {
            popup_dialog("Syntax Error", "Invalid entry");
            proceed_count = 0;
            empty_proceed_count = 0;
        } else {
           popup_dialog("Subscription", "Please Subscribe to unlocked premium feature.");
        }


    }//end e_pre_Solve()





    /********************************SOLVE Differential of log_ten************************************/
    private void log_ten_pre_Solve(){
        String content;

        /**get & check content of main constant**/
        content = constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = dydx_denominator.getText().toString();
        if(!content.equals("")) {
            verify_editText_dydx_denominator(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of editText**/
        content = log_ten_constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = log_ten_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

       if (proceed_count>0 || empty_proceed_count>0) {
            popup_dialog("Syntax Error", "Invalid entry");
            proceed_count = 0;
            empty_proceed_count = 0;
        } else {
           popup_dialog("Subscription", "Please Subscribe to unlocked premium feature.");
        }

        String solve;

    }//end log_ten_pre_Solve()






    /********************************SOLVE Differential of any_root************************************/
    private void any_root_pre_Solve(){
        String content;

        /**get & check content of main constant**/
        content = constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = dydx_denominator.getText().toString();
        if(!content.equals("")) {
            verify_editText_dydx_denominator(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of editText**/
        content = any_root_constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = pre_any_root_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of editText**/
        content = post_any_root_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

       if (proceed_count>0 || empty_proceed_count>0) {
            popup_dialog("Syntax Error", "Invalid entry");
            proceed_count = 0;
            empty_proceed_count = 0;
        } else {
           popup_dialog("Subscription", "Please Subscribe to unlocked premium feature.");
        }


    }//end any_root_pre_Solve()






    /********************************SOLVE Differential of power**************JDSLK**********************/
    private void power_pre_Solve(){
        String content;

        /**get & check content of main constant**/
        content = constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = dydx_denominator.getText().toString();
        if(!content.equals("")) {
            verify_editText_dydx_denominator(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of main constant**/
        content = superScript_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_logBases_powers_squares(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of editText**/
        content = power_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }


       if (proceed_count>0 || empty_proceed_count>0) {
            popup_dialog("Syntax Error", "Invalid entry");
            proceed_count = 0;
            empty_proceed_count = 0;

        } else {
           popup_dialog("Subscription", "Please Subscribe to unlocked premium feature.");
        }

        String solve;

    }//end power_pre_Solve()




    /********************************SOLVE Differential of log_base*********jdslk***************************/
    private void log_base_pre_Solve(){
        String content;

        /**get & check content of main constant**/
        content = constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = dydx_denominator.getText().toString();
        if(!content.equals("")) {
            verify_editText_dydx_denominator(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of editText**/
        content = log_base_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of main constant**/
        content = log_base_constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of main constant**/
        content = superScript.getText().toString();
        if(!content.equals("")) {
            verify_editText_logBases_powers_squares(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

       if (proceed_count>0 || empty_proceed_count>0) {
            popup_dialog("Syntax Error", "Invalid entry");
            proceed_count = 0;
            empty_proceed_count = 0;
        } else {
           popup_dialog("Subscription", "Please Subscribe to unlocked premium feature.");
        }

    }//end log_base_pre_Solve()






    /********************************SOLVE Differential of squared************************************/
    private void squared_pre_Solve(){
        String content;

        /**get & check content of main constant**/
        content = constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = dydx_denominator.getText().toString();
        if(!content.equals("")) {
            verify_editText_dydx_denominator(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of editText**/
        content = squared_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

       if (proceed_count>0 || empty_proceed_count>0) {
            popup_dialog("Syntax Error", "Invalid entry");
            proceed_count = 0;
            empty_proceed_count = 0;
        } else {
           popup_dialog("Subscription", "Please Subscribe to unlocked premium feature.");
        }


    }//end squared_pre_Solve()





    /********************************SOLVE Differential of square_root************************************/
    private void square_root_pre_Solve(){
        String content;

        /**get & check content of main constant**/
        content = constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = dydx_denominator.getText().toString();
        if(!content.equals("")) {
            verify_editText_dydx_denominator(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of main constant**/
        content = square_root_constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = square_root_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

       if (proceed_count>0 || empty_proceed_count>0) {
            popup_dialog("Syntax Error", "Invalid entry");
            proceed_count = 0;
            empty_proceed_count = 0;

        } else {
           popup_dialog("Subscription", "Please Subscribe to unlocked premium feature.");
        }

        String solve;

    }//end square_root_pre_Solve()






    /********************************SOLVE Differential of divide************************************/
    private void divide_pre_Solve(){
        String content;

        /**get & check content of main constant**/
        content = constant.getText().toString();
        if(!content.equals("")) {
            verify_editText_constants(content);
        }

        /**get & check content of editText**/
        content = dydx_denominator.getText().toString();
        if(!content.equals("")) {
            verify_editText_dydx_denominator(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of editText**/
        content = denominator_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

        /**get & check content of editText**/
        content = numerator_box.getText().toString();
        if(!content.equals("")) {
            verify_editText_2x_equ(content);
        }else if(content.equals("")){
            empty_proceed_count++;
        }

       if (proceed_count>0 || empty_proceed_count>0) {
            popup_dialog("Syntax Error", "Invalid entry");
            proceed_count = 0;
            empty_proceed_count = 0;
        } else {
           popup_dialog("Subscription", "Please Subscribe to unlocked premium feature.");
        }


    }//end divide_pre_Solve()







    /**************************************************************WE ARE SOLVING coreEqu DOWN HERE********************************************************/
    /**************************************************************WE ARE SOLVING coreEqu DOWN HERE********************************************************/
    /**************************************************************WE ARE SOLVING coreEqu DOWN HERE********************************************************/
    private void coreEqu_Solving(String coefficient_string, String core_Equ){

        /**Actual Values i'm working with converted from String**/
        double coefficient_num = 1;
        double constant_of_x = 1;
        String answer = "null";
        boolean is_a_constant = false;
        boolean contains_pie = false;



        /**check if equation is of form [2ππ] or [2xx]**/
        char [] chars = core_Equ.toCharArray();
        int count_x = 0;
        int count_π = 0;
        for (char aChar : chars) {
            if (aChar == 'x') {
                count_x++;
            } else if (aChar == 'π') {
                count_π++;
            }
        }//end for()

        if(count_x>1 || count_π>1){
            popup_dialog("Incorrect entry", "Use □ ² or □ ˣ\nto calculate multiple variables");
            return;
        }/**DONE!!! check if equation is of form [2ππ] or [2xx]**/


        /**check if equation for usable constants]**/
        if(!coefficient_string.equals("0") && coefficient_string.length()>0 && !coefficient_string.contains("π")){
            coefficient_num = Double.parseDouble(coefficient_string);
            is_a_constant = true;
        }else if(!coefficient_string.equals("0") && coefficient_string.length()>0 && coefficient_string.contains("π")){

            if((coefficient_string.contains("π") && coefficient_string.length()>1)){
                coefficient_num = 3.14 * Double.parseDouble(coefficient_string.substring(0,coefficient_string.length()-1));
                is_a_constant = true;
            }

            if((coefficient_string.equals("π"))){
                coefficient_num = 3.14;
                is_a_constant = true;
            }

        }

        if(core_Equ.contains("π")){
            contains_pie = true;
        }

        /**Getting constants and variables from equations**/
        if(core_Equ.equals("x")){
            answer = "1@Equ_solved";

            if(is_a_constant){
                answer = coefficient_num + "@Equ_solved";
            }

        /**check if equation is of type [27x]**/
        }
        if(core_Equ.contains("x") && core_Equ.length()>1 && !contains_pie){
            constant_of_x = Double.parseDouble(core_Equ.substring(0,core_Equ.length()-1));
            answer = core_Equ.substring(0,core_Equ.length()-1) + "@Equ_solved";

            if(is_a_constant) {
                answer = (coefficient_num * constant_of_x) + "@Equ_solved";
            }

        }
        if(core_Equ.contains("x") && core_Equ.length()>2 && contains_pie){
            constant_of_x = Double.parseDouble(core_Equ.substring(0,core_Equ.length()-2));
            answer = constant_of_x + "π@Equ_solved";

            /**check if equation is of type [3 * 27x]**/
            if(is_a_constant){
                answer = (coefficient_num*constant_of_x) + "π@Equ_solved";
            }//outer if()

        }
        if(!core_Equ.contains("x") || coefficient_string.equals("0") || constant_of_x==0){
            answer = "0.0@Equ_solved";

        }
        if(core_Equ.equals("πx")){
            answer = "π@Equ_solved";
            if(is_a_constant){
                answer = (coefficient_num) + "π@Equ_solved";
            }
        }
        if(answer.contains("3.14π")){
            answer = "9.8596@Equ_solved";
        }

        middleMan_interface.data_carrier(answer + "coreEqu_Solving");
    }//end coreEqu_Solving()







    /**************************************************************WE ARE SOLVING cos DOWN HERE********************************************************/
    /**************************************************************WE ARE SOLVING cos DOWN HERE********************************************************/
    /**************************************************************WE ARE SOLVING cos DOWN HERE********************************************************/

    private void cos_Solving(String coefficient_string, String cos_constant_string, String cos_equ){
        String answer = "null";
        double constant_of_x = 1;
        double coefficient_num = 1;
        double cos_constant_num = 1;
        boolean coefficient_exists = false;
        boolean cos_constant_exists = false;
        boolean equ_contains_pie = false;


        /**check if equation is of form [2ππ] or [2xx]**/
        char [] chars = cos_equ.toCharArray();
        int count_x = 0;
        int count_π = 0;
        for (char aChar : chars) {
            if (aChar == 'x') {
                count_x++;
            } else if (aChar == 'π') {
                count_π++;
            }
        }//end for()

        if(count_x>1 || count_π>1){
            popup_dialog("Incorrect entry", "Use □ ² or □ ˣ\nto calculate multiple variables");
            return;
        }
        /**DONE!!! check if equation is of form [2ππ] or [2xx]**/


        /**check if equation for usable constants]**/
        if(!coefficient_string.equals("0") && coefficient_string.length()>0 && !coefficient_string.contains("π")){
            coefficient_num = Double.parseDouble(coefficient_string);
            coefficient_exists = true;
        }else if(!coefficient_string.equals("0") && coefficient_string.length()>0 && coefficient_string.contains("π")){

            if(coefficient_string.contains("π") && coefficient_string.length()>1 && !coefficient_string.equals("-π") && !coefficient_string.equals("+π")){
                coefficient_num = 3.14 * Double.parseDouble(coefficient_string.substring(0,coefficient_string.length()-1));
                coefficient_exists = true;
            }

            if(coefficient_string.equals("-π")){
                coefficient_num = -3.14;
                coefficient_exists = true;
            }
            if(coefficient_string.equals("+π")){
                coefficient_num = 3.14;
                coefficient_exists = true;
            }

            if((coefficient_string.equals("π"))){
                coefficient_num = 3.14;
                coefficient_exists = true;
            }
        }

        if(!cos_constant_string.equals("0") && cos_constant_string.length()>0 && !cos_constant_string.contains("π")){
            cos_constant_num = Double.parseDouble(cos_constant_string);
            cos_constant_exists = true;
        }else if(!cos_constant_string.equals("0") && cos_constant_string.length()>0 && cos_constant_string.contains("π")){

            if((cos_constant_string.contains("π") && cos_constant_string.length()>1) && !cos_constant_string.equals("-π") && !cos_constant_string.equals("+π")){
                cos_constant_num = 3.14 * Double.parseDouble(cos_constant_string.substring(0,cos_constant_string.length()-1));
                cos_constant_exists = true;
            }

            if(cos_constant_string.equals("-π")){
                cos_constant_num = -3.14;
                cos_constant_exists = true;
            }

            if(cos_constant_string.equals("+π")){
                cos_constant_num = 3.14;
                cos_constant_exists = true;
            }

            if((cos_constant_string.equals("π"))){
                cos_constant_num = 3.14;
                cos_constant_exists = true;
            }
        }


        /**check if equation contains a pie***/
        if(cos_equ.contains("π")){
            equ_contains_pie = true;
        }

        /**Expert System - Data Driven**/
        /**Expert System - Data Driven**/
        /**Expert System - Data Driven**/
        if((!cos_equ.contains("x") && cos_equ.length()>0) ||coefficient_string.equals("0") || coefficient_num==0 || cos_constant_string.equals("0") || cos_constant_num==0){
            answer = "0.0@Equ_solved";
        }
        
        if(cos_equ.contains("x") && cos_equ.length()>1 && !equ_contains_pie && !cos_equ.equals("-x")){
            constant_of_x = Double.parseDouble(cos_equ.substring(0,cos_equ.length()-1));
            answer = -1*constant_of_x + "sin(" +cos_equ +")@Equ_solved" ;

            if(coefficient_exists){
                answer = -1*coefficient_num*constant_of_x + "sin(" +cos_equ +")@Equ_solved" ;
            }
            if(cos_constant_exists){
                answer = -1*cos_constant_num*constant_of_x + "sin(" +cos_equ +")@Equ_solved" ;
            }
            if(cos_constant_exists && coefficient_exists){
                answer = -1*coefficient_num*cos_constant_num*constant_of_x + "sin(" +cos_equ +")@Equ_solved" ;
            }
            if(constant_of_x==0){
                answer = "0.0@Equ_solved";
            }

        }else if(cos_equ.contains("x") && cos_equ.length()>1 && equ_contains_pie && !cos_equ.equals("πx") && !cos_equ.equals("-x")){

            if(cos_equ.equals("-πx")) {
                constant_of_x = -3.14;
                answer = "-πsec²(" +cos_equ +")@Equ_solved" ;
            }else if(cos_equ.equals("+πx")) {
                constant_of_x = +3.14;
                answer = "πsec²(" +cos_equ +")@Equ_solved" ;
            }else {
                constant_of_x = Double.parseDouble(cos_equ.substring(0, cos_equ.length() - 2));
                answer = constant_of_x + "πsec²(" +cos_equ +")@Equ_solved" ;
            }


            if(coefficient_exists){
                answer = coefficient_num*constant_of_x + "πsec²(" +cos_equ +")@Equ_solved" ;
            }
            if(cos_constant_exists){
                answer = cos_constant_num*constant_of_x + "πsec²(" +cos_equ +")@Equ_solved" ;
            }
            if(cos_constant_exists && coefficient_exists){
                answer = coefficient_num*cos_constant_num*constant_of_x + "πsec²(" +cos_equ +")@Equ_solved" ;
            }
            if(constant_of_x==0){
                answer = "0.0@Equ_solved";
            }

        }else if(cos_equ.equals("0")){
            answer = "0.0@Equ_solved";

        }else if(cos_equ.equals("πx")){
            answer = "-πsin(" +cos_equ +")@Equ_solved" ;
            if(coefficient_exists){
                answer = -1*coefficient_num*constant_of_x + "πsin(" +cos_equ +")@Equ_solved" ;
            }
            if(cos_constant_exists){
                answer = -1*cos_constant_num*constant_of_x + "πsin(" +cos_equ +")@Equ_solved" ;
            }
            if(cos_constant_exists && coefficient_exists){
                answer = -1*coefficient_num*cos_constant_num*constant_of_x + "πsin(" +cos_equ +")@Equ_solved" ;
            }
        }else if(cos_equ.equals("-x")){
            answer = -1*-1*coefficient_num*cos_constant_num*constant_of_x + "cot(" +cos_equ +")"+" cos("+ cos_equ +")@Equ_solved";
        }else if(cos_equ.equals("x")){
            answer = -1*coefficient_num*cos_constant_num*constant_of_x + "cot(" +cos_equ +")"+" cos("+ cos_equ +")@Equ_solved";
        }

        middleMan_interface.data_carrier(answer + "cos_Solving");
    }//end cos_Solving()












    /**************************************************************WE ARE SOLVING sin DOWN HERE********************************************************/
    /**************************************************************WE ARE SOLVING sin DOWN HERE********************************************************/
    /**************************************************************WE ARE SOLVING sin DOWN HERE********************************************************/

    private void sin_Solving(String coefficient_string, String sin_constant_string, String sin_equ){
        String answer = "null";
        double constant_of_x = 1;
        double coefficient_num = 1;
        double sin_constant_num = 1;
        boolean coefficient_exists = false;
        boolean sin_constant_exists = false;
        boolean equ_contains_pie = false;


        /**check if equation is of form [2ππ] or [2xx]**/
        char [] chars = sin_equ.toCharArray();
        int count_x = 0;
        int count_π = 0;
        for (char aChar : chars) {
            if (aChar == 'x') {
                count_x++;
            } else if (aChar == 'π') {
                count_π++;
            }
        }//end for()

        if(count_x>1 || count_π>1){
            popup_dialog("Incorrect entry", "Use □ ² or □ ˣ\nto calculate multiple variables");
            return;
        }
        /**DONE!!! check if equation is of form [2ππ] or [2xx]**/


        /**check if equation for usable constants]**/
        if(!coefficient_string.equals("0") && coefficient_string.length()>0 && !coefficient_string.contains("π")){
            coefficient_num = Double.parseDouble(coefficient_string);
            coefficient_exists = true;
        }else if(!coefficient_string.equals("0") && coefficient_string.length()>0 && coefficient_string.contains("π")){

            if(coefficient_string.contains("π") && coefficient_string.length()>1 && !coefficient_string.equals("-π") && !coefficient_string.equals("+π")){
                coefficient_num = 3.14 * Double.parseDouble(coefficient_string.substring(0,coefficient_string.length()-1));
                coefficient_exists = true;
            }

            if(coefficient_string.equals("-π")){
                coefficient_num = -3.14;
                coefficient_exists = true;
            }
            if(coefficient_string.equals("+π")){
                coefficient_num = 3.14;
                coefficient_exists = true;
            }

            if((coefficient_string.equals("π"))){
                coefficient_num = 3.14;
                coefficient_exists = true;
            }
        }

        if(!sin_constant_string.equals("0") && sin_constant_string.length()>0 && !sin_constant_string.contains("π")){
            sin_constant_num = Double.parseDouble(sin_constant_string);
            sin_constant_exists = true;
        }else if(!sin_constant_string.equals("0") && sin_constant_string.length()>0 && sin_constant_string.contains("π")){

            if((sin_constant_string.contains("π") && sin_constant_string.length()>1) && !sin_constant_string.equals("-π") && !sin_constant_string.equals("+π")){
                sin_constant_num = 3.14 * Double.parseDouble(sin_constant_string.substring(0,sin_constant_string.length()-1));
                sin_constant_exists = true;
            }

            if(sin_constant_string.equals("-π")){
                sin_constant_num = -3.14;
                sin_constant_exists = true;
            }

            if(sin_constant_string.equals("+π")){
                sin_constant_num = 3.14;
                sin_constant_exists = true;
            }

            if((sin_constant_string.equals("π"))){
                sin_constant_num = 3.14;
                sin_constant_exists = true;
            }
        }


        /**check if equation contains a pie***/
        if(sin_equ.contains("π")){
            equ_contains_pie = true;
        }

        /**Expert System - Data Driven**/
        /**Expert System - Data Driven**/
        /**Expert System - Data Driven**/
        if((!sin_equ.contains("x") && sin_equ.length()>0) ||coefficient_string.equals("0") || coefficient_num==0 || sin_constant_string.equals("0") || sin_constant_num==0){
            answer = "0.0@Equ_solved";
        }

        if(sin_equ.contains("x") && sin_equ.length()>1 && !equ_contains_pie && !sin_equ.equals("-x")){
            constant_of_x = Double.parseDouble(sin_equ.substring(0,sin_equ.length()-1));
            answer = constant_of_x + "cos(" +sin_equ +")@Equ_solved" ;

            if(coefficient_exists){
                answer = coefficient_num*constant_of_x + "cos(" +sin_equ +")@Equ_solved" ;
            }
            if(sin_constant_exists){
                answer = sin_constant_num*constant_of_x + "cos(" +sin_equ +")@Equ_solved" ;
            }
            if(sin_constant_exists && coefficient_exists){
                answer = coefficient_num*sin_constant_num*constant_of_x + "cos(" +sin_equ +")@Equ_solved" ;
            }
            if(constant_of_x==0){
                answer = "0.0@Equ_solved";
            }

        }else if(sin_equ.contains("x") && sin_equ.length()>1 && equ_contains_pie && !sin_equ.equals("πx") && !sin_equ.equals("-x")){

            if(sin_equ.equals("-πx")) {
                constant_of_x = -3.14;
                answer = "-πcos(" +sin_equ +")@Equ_solved" ;
            }else if(sin_equ.equals("+πx")) {
                constant_of_x = +3.14;
                answer = "πcos(" +sin_equ +")@Equ_solved" ;
            }else {
                constant_of_x = Double.parseDouble(sin_equ.substring(0, sin_equ.length() - 2));
                answer = constant_of_x + "πcos(" +sin_equ +")@Equ_solved" ;
            }


            if(coefficient_exists){
                answer = coefficient_num*constant_of_x + "πcos(" +sin_equ +")@Equ_solved" ;
            }
            if(sin_constant_exists){
                answer = sin_constant_num*constant_of_x + "πcos(" +sin_equ +")@Equ_solved" ;
            }
            if(sin_constant_exists && coefficient_exists){
                answer = coefficient_num*sin_constant_num*constant_of_x + "πcos(" +sin_equ +")@Equ_solved" ;
            }
            if(constant_of_x==0){
                answer = "0.0@Equ_solved";
            }

        }else if(sin_equ.equals("0")){
            answer = "0.0@Equ_solved";

        }else if(sin_equ.equals("πx")){
            answer = "πcos(" +sin_equ +")@Equ_solved";
            if(coefficient_exists){
                answer = coefficient_num*constant_of_x + "πcos(" +sin_equ +")@Equ_solved" ;
            }
            if(sin_constant_exists){
                answer = sin_constant_num*constant_of_x + "πcos(" +sin_equ +")@Equ_solved" ;
            }
            if(sin_constant_exists && coefficient_exists){
                answer = coefficient_num*sin_constant_num*constant_of_x + "πcos(" +sin_equ +")@Equ_solved" ;
            }
        }else if(sin_equ.equals("-x")){
            answer = -1*coefficient_num*sin_constant_num*constant_of_x + "cos(" +sin_equ +")@Equ_solved";
        }else if(sin_equ.equals("x")){
            answer = coefficient_num*sin_constant_num*constant_of_x + "cos(" +sin_equ +")@Equ_solved";
        }

        middleMan_interface.data_carrier(answer + "sin_Solving");
    }//end sin_Solving()














    /**************************************************************WE ARE SOLVING tan DOWN HERE********************************************************/
    /**************************************************************WE ARE SOLVING tan DOWN HERE********************************************************/
    /**************************************************************WE ARE SOLVING tan DOWN HERE********************************************************/

    private void tan_Solving(String coefficient_string, String tan_constant_string, String tan_equ){
        String answer = "null";
        double constant_of_x = 1;
        double coefficient_num = 1;
        double tan_constant_num = 1;
        boolean coefficient_exists = false;
        boolean tan_constant_exists = false;
        boolean equ_contains_pie = false;


        /**check if equation is of form [2ππ] or [2xx]**/
        char [] chars = tan_equ.toCharArray();
        int count_x = 0;
        int count_π = 0;
        for (char aChar : chars) {
            if (aChar == 'x') {
                count_x++;
            } else if (aChar == 'π') {
                count_π++;
            }
        }//end for()

        if(count_x>1 || count_π>1){
            popup_dialog("Incorrect entry", "Use □ ² or □ ˣ\nto calculate multiple variables");
            return;
        }
        /**DONE!!! check if equation is of form [2ππ] or [2xx]**/


        /**check if equation for usable constants]**/
        if(!coefficient_string.equals("0") && coefficient_string.length()>0 && !coefficient_string.contains("π")){
            coefficient_num = Double.parseDouble(coefficient_string);
            coefficient_exists = true;
        }else if(!coefficient_string.equals("0") && coefficient_string.length()>0 && coefficient_string.contains("π")){

            if(coefficient_string.contains("π") && coefficient_string.length()>1 && !coefficient_string.equals("-π") && !coefficient_string.equals("+π")){
                coefficient_num = 3.14 * Double.parseDouble(coefficient_string.substring(0,coefficient_string.length()-1));
                coefficient_exists = true;
            }

            if(coefficient_string.equals("-π")){
                coefficient_num = -3.14;
                coefficient_exists = true;
            }
            if(coefficient_string.equals("+π")){
                coefficient_num = 3.14;
                coefficient_exists = true;
            }

            if((coefficient_string.equals("π"))){
                coefficient_num = 3.14;
                coefficient_exists = true;
            }
        }

        if(!tan_constant_string.equals("0") && tan_constant_string.length()>0 && !tan_constant_string.contains("π")){
            tan_constant_num = Double.parseDouble(tan_constant_string);
            tan_constant_exists = true;
        }else if(!tan_constant_string.equals("0") && tan_constant_string.length()>0 && tan_constant_string.contains("π")){

            if((tan_constant_string.contains("π") && tan_constant_string.length()>1) && !tan_constant_string.equals("-π") && !tan_constant_string.equals("+π")){
                tan_constant_num = 3.14 * Double.parseDouble(tan_constant_string.substring(0,tan_constant_string.length()-1));
                tan_constant_exists = true;
            }

            if(tan_constant_string.equals("-π")){
                tan_constant_num = -3.14;
                tan_constant_exists = true;
            }

            if(tan_constant_string.equals("+π")){
                tan_constant_num = 3.14;
                tan_constant_exists = true;
            }

            if((tan_constant_string.equals("π"))){
                tan_constant_num = 3.14;
                tan_constant_exists = true;
            }
        }


        /**check if equation contains a pie***/
        if(tan_equ.contains("π")){
            equ_contains_pie = true;
        }

        /**Expert System - Data Driven**/
        /**Expert System - Data Driven**/
        /**Expert System - Data Driven**/
        if((!tan_equ.contains("x") && tan_equ.length()>0) ||coefficient_string.equals("0") || coefficient_num==0 || tan_constant_string.equals("0") || tan_constant_num==0){
            answer = "0.0@Equ_solved";
        }

        if(tan_equ.contains("x") && tan_equ.length()>1 && !equ_contains_pie && !tan_equ.equals("-x")){
            constant_of_x = Double.parseDouble(tan_equ.substring(0,tan_equ.length()-1));
            answer = constant_of_x + "sec²(" +tan_equ +")@Equ_solved" ;

            if(coefficient_exists){
                answer = coefficient_num*constant_of_x + "sec²(" +tan_equ +")@Equ_solved" ;
            }
            if(tan_constant_exists){
                answer = tan_constant_num*constant_of_x + "sec²(" +tan_equ +")@Equ_solved" ;
            }
            if(tan_constant_exists && coefficient_exists){
                answer = coefficient_num*tan_constant_num*constant_of_x + "sec²(" +tan_equ +")@Equ_solved" ;
            }
            if(constant_of_x==0){
                answer = "0.0@Equ_solved";
            }

        }else if(tan_equ.contains("x") && tan_equ.length()>1 && equ_contains_pie && !tan_equ.equals("πx") && !tan_equ.equals("-x")){

            if(tan_equ.equals("-πx")) {
                constant_of_x = -3.14;
                answer = "-πsec²(" +tan_equ +")@Equ_solved" ;
            }else if(tan_equ.equals("+πx")) {
                constant_of_x = +3.14;
                answer = "πsec²(" +tan_equ +")@Equ_solved" ;
            }else {
                constant_of_x = Double.parseDouble(tan_equ.substring(0, tan_equ.length() - 2));
                answer = constant_of_x + "πsec²(" +tan_equ +")@Equ_solved" ;
            }


            if(coefficient_exists){
                answer = coefficient_num*constant_of_x + "πsec²(" +tan_equ +")@Equ_solved" ;
            }
            if(tan_constant_exists){
                answer = tan_constant_num*constant_of_x + "πsec²(" +tan_equ +")@Equ_solved" ;
            }
            if(tan_constant_exists && coefficient_exists){
                answer = coefficient_num*tan_constant_num*constant_of_x + "πsec²(" +tan_equ +")@Equ_solved" ;
            }
            if(constant_of_x==0){
                answer = "0.0@Equ_solved";
            }

        }else if(tan_equ.equals("0")){
            answer = "0.0@Equ_solved";

        }else if(tan_equ.equals("πx")){
            answer = "πsec²(" +tan_equ +")@Equ_solved";
            if(coefficient_exists){
                answer = coefficient_num*constant_of_x + "πsec²(" +tan_equ +")@Equ_solved" ;
            }
            if(tan_constant_exists){
                answer = tan_constant_num*constant_of_x + "πsec²(" +tan_equ +")@Equ_solved" ;
            }
            if(tan_constant_exists && coefficient_exists){
                answer = coefficient_num*tan_constant_num*constant_of_x + "πsec²(" +tan_equ +")@Equ_solved" ;
            }
        }else if(tan_equ.equals("-x")){
            answer = -1*coefficient_num*tan_constant_num*constant_of_x + "sec²(" +tan_equ +")@Equ_solved" ;
        }else if(tan_equ.equals("x")){
            answer = coefficient_num*tan_constant_num*constant_of_x + "sec²(" +tan_equ +")@Equ_solved" ;
        }

        middleMan_interface.data_carrier(answer + "tan_Solving");
    }//end tan_Solving()











    /**************************************************************WE ARE SOLVING sec DOWN HERE********************************************************/
    /**************************************************************WE ARE SOLVING sec DOWN HERE********************************************************/
    /**************************************************************WE ARE SOLVING sec DOWN HERE********************************************************/

    private void sec_Solving(String coefficient_string, String sec_constant_string, String sec_equ){
        String answer = "null";
        double constant_of_x = 1;
        double coefficient_num = 1;
        double sec_constant_num = 1;
        boolean coefficient_exists = false;
        boolean sec_constant_exists = false;
        boolean equ_contains_pie = false;


        /**check if equation is of form [2ππ] or [2xx]**/
        char [] chars = sec_equ.toCharArray();
        int count_x = 0;
        int count_π = 0;
        for (char aChar : chars) {
            if (aChar == 'x') {
                count_x++;
            } else if (aChar == 'π') {
                count_π++;
            }
        }//end for()

        if(count_x>1 || count_π>1){
            popup_dialog("Incorrect entry", "Use □ ² or □ ˣ\nto calculate multiple variables");
            return;
        }
        /**DONE!!! check if equation is of form [2ππ] or [2xx]**/


        /**check if equation for usable constants]**/
        if(!coefficient_string.equals("0") && coefficient_string.length()>0 && !coefficient_string.contains("π")){
            coefficient_num = Double.parseDouble(coefficient_string);
            coefficient_exists = true;
        }else if(!coefficient_string.equals("0") && coefficient_string.length()>0 && coefficient_string.contains("π")){

            if(coefficient_string.contains("π") && coefficient_string.length()>1 && !coefficient_string.equals("-π") && !coefficient_string.equals("+π")){
                coefficient_num = 3.14 * Double.parseDouble(coefficient_string.substring(0,coefficient_string.length()-1));
                coefficient_exists = true;
            }

            if(coefficient_string.equals("-π")){
                coefficient_num = -3.14;
                coefficient_exists = true;
            }
            if(coefficient_string.equals("+π")){
                coefficient_num = 3.14;
                coefficient_exists = true;
            }

            if((coefficient_string.equals("π"))){
                coefficient_num = 3.14;
                coefficient_exists = true;
            }
        }

        if(!sec_constant_string.equals("0") && sec_constant_string.length()>0 && !sec_constant_string.contains("π")){
            sec_constant_num = Double.parseDouble(sec_constant_string);
            sec_constant_exists = true;
        }else if(!sec_constant_string.equals("0") && sec_constant_string.length()>0 && sec_constant_string.contains("π")){

            if((sec_constant_string.contains("π") && sec_constant_string.length()>1) && !sec_constant_string.equals("-π") && !sec_constant_string.equals("+π")){
                sec_constant_num = 3.14 * Double.parseDouble(sec_constant_string.substring(0,sec_constant_string.length()-1));
                sec_constant_exists = true;
            }

            if(sec_constant_string.equals("-π")){
                sec_constant_num = -3.14;
                sec_constant_exists = true;
            }

            if(sec_constant_string.equals("+π")){
                sec_constant_num = 3.14;
                sec_constant_exists = true;
            }

            if((sec_constant_string.equals("π"))){
                sec_constant_num = 3.14;
                sec_constant_exists = true;
            }
        }


        /**check if equation contains a pie***/
        if(sec_equ.contains("π")){
            equ_contains_pie = true;
        }

        /**Expert System - Data Driven**/
        /**Expert System - Data Driven**/
        /**Expert System - Data Driven**/
        if((!sec_equ.contains("x") && sec_equ.length()>0) ||coefficient_string.equals("0") || coefficient_num==0 || sec_constant_string.equals("0") || sec_constant_num==0){
            answer = "0.0@Equ_solved";
        }

        if(sec_equ.contains("x") && sec_equ.length()>1 && !equ_contains_pie && !sec_equ.equals("-x")){
            constant_of_x = Double.parseDouble(sec_equ.substring(0,sec_equ.length()-1));
            answer = constant_of_x + "sec(" +sec_equ +")"+" tan("+ sec_equ +")@Equ_solved";

            if(coefficient_exists){
                answer = coefficient_num*constant_of_x + "sec(" +sec_equ +")"+" tan("+ sec_equ +")@Equ_solved";
            }
            if(sec_constant_exists){
                answer = sec_constant_num*constant_of_x + "sec(" +sec_equ +")"+" tan("+ sec_equ +")@Equ_solved";
            }
            if(sec_constant_exists && coefficient_exists){
                answer = coefficient_num*sec_constant_num*constant_of_x + "sec(" +sec_equ +")"+" tan("+ sec_equ +")@Equ_solved";
            }
            if(constant_of_x==0){
                answer = "0.0@Equ_solved";
            }

        }else if(sec_equ.contains("x") && sec_equ.length()>1 && equ_contains_pie && !sec_equ.equals("πx") && !sec_equ.equals("-x")){

            if(sec_equ.equals("-πx")) {
                constant_of_x = -3.14;
                answer = "-πsec(" +sec_equ +")"+" tan("+ sec_equ +")@Equ_solved";
            }else if(sec_equ.equals("+πx")) {
                constant_of_x = +3.14;
                answer = "πsec(" +sec_equ +")"+" tan("+ sec_equ +")@Equ_solved";
            }else {
                constant_of_x = Double.parseDouble(sec_equ.substring(0, sec_equ.length() - 2));
                answer = constant_of_x + "πsec(" +sec_equ +")"+" tan("+ sec_equ +")@Equ_solved";
            }


            if(coefficient_exists){
                answer = coefficient_num*constant_of_x + "πsec(" +sec_equ +")"+" tan("+ sec_equ +")@Equ_solved";
            }
            if(sec_constant_exists){
                answer = sec_constant_num*constant_of_x + "πsec(" +sec_equ +")"+" tan("+ sec_equ +")@Equ_solved";
            }
            if(sec_constant_exists && coefficient_exists){
                answer = coefficient_num*sec_constant_num*constant_of_x + "πsec(" +sec_equ +")"+" tan("+ sec_equ +")@Equ_solved";
            }
            if(constant_of_x==0){
                answer = "0.0@Equ_solved";
            }

        }else if(sec_equ.equals("0")){
            answer = "0.0@Equ_solved";

        }else if(sec_equ.equals("πx")){
            answer = "πsec²(" +sec_equ +")@Equ_solved";
            if(coefficient_exists){
                answer = coefficient_num*constant_of_x + "πsec(" +sec_equ +")"+" tan("+ sec_equ +")@Equ_solved";
            }
            if(sec_constant_exists){
                answer = sec_constant_num*constant_of_x + "πsec(" +sec_equ +")"+" tan("+ sec_equ +")@Equ_solved";
            }
            if(sec_constant_exists && coefficient_exists){
                answer = coefficient_num*sec_constant_num*constant_of_x + "πsec(" +sec_equ +")"+" tan("+ sec_equ +")@Equ_solved";
            }
        }else if(sec_equ.equals("-x")){
            answer = -1*coefficient_num*sec_constant_num*constant_of_x + "cot(" +sec_equ +")"+" sec("+ sec_equ +")@Equ_solved";
        }else if(sec_equ.equals("x")){
            answer = coefficient_num*sec_constant_num*constant_of_x + "cot(" +sec_equ +")"+" sec("+ sec_equ +")@Equ_solved";
        }

        middleMan_interface.data_carrier(answer + "sec_Solving");
    }//end sec_Solving()












    /**************************************************************WE ARE SOLVING csc DOWN HERE********************************************************/
    /**************************************************************WE ARE SOLVING csc DOWN HERE********************************************************/
    /**************************************************************WE ARE SOLVING csc DOWN HERE********************************************************/

    private void csc_Solving(String coefficient_string, String csc_constant_string, String csc_equ){
        String answer = "null";
        double constant_of_x = 1;
        double coefficient_num = 1;
        double csc_constant_num = 1;
        boolean coefficient_exists = false;
        boolean csc_constant_exists = false;
        boolean equ_contains_pie = false;


        /**check if equation is of form [2ππ] or [2xx]**/
        char [] chars = csc_equ.toCharArray();
        int count_x = 0;
        int count_π = 0;
        for (char aChar : chars) {
            if (aChar == 'x') {
                count_x++;
            } else if (aChar == 'π') {
                count_π++;
            }
        }//end for()

        if(count_x>1 || count_π>1){
            popup_dialog("Incorrect entry", "Use □ ² or □ ˣ\nto calculate multiple variables");
            return;
        }
        /**DONE!!! check if equation is of form [2ππ] or [2xx]**/


        /**check if equation for usable constants]**/
        if(!coefficient_string.equals("0") && coefficient_string.length()>0 && !coefficient_string.contains("π")){
            coefficient_num = Double.parseDouble(coefficient_string);
            coefficient_exists = true;
        }else if(!coefficient_string.equals("0") && coefficient_string.length()>0 && coefficient_string.contains("π")){

            if(coefficient_string.contains("π") && coefficient_string.length()>1 && !coefficient_string.equals("-π") && !coefficient_string.equals("+π")){
                coefficient_num = 3.14 * Double.parseDouble(coefficient_string.substring(0,coefficient_string.length()-1));
                coefficient_exists = true;
            }

            if(coefficient_string.equals("-π")){
                coefficient_num = -3.14;
                coefficient_exists = true;
            }
            if(coefficient_string.equals("+π")){
                coefficient_num = 3.14;
                coefficient_exists = true;
            }

            if((coefficient_string.equals("π"))){
                coefficient_num = 3.14;
                coefficient_exists = true;
            }
        }

        if(!csc_constant_string.equals("0") && csc_constant_string.length()>0 && !csc_constant_string.contains("π")){
            csc_constant_num = Double.parseDouble(csc_constant_string);
            csc_constant_exists = true;
        }else if(!csc_constant_string.equals("0") && csc_constant_string.length()>0 && csc_constant_string.contains("π")){

            if((csc_constant_string.contains("π") && csc_constant_string.length()>1) && !csc_constant_string.equals("-π") && !csc_constant_string.equals("+π")){
                csc_constant_num = 3.14 * Double.parseDouble(csc_constant_string.substring(0,csc_constant_string.length()-1));
                csc_constant_exists = true;
            }

            if(csc_constant_string.equals("-π")){
                csc_constant_num = -3.14;
                csc_constant_exists = true;
            }

            if(csc_constant_string.equals("+π")){
                csc_constant_num = 3.14;
                csc_constant_exists = true;
            }

            if((csc_constant_string.equals("π"))){
                csc_constant_num = 3.14;
                csc_constant_exists = true;
            }
        }


        /**check if equation contains a pie***/
        if(csc_equ.contains("π")){
            equ_contains_pie = true;
        }

        /**Expert System - Data Driven**/
        /**Expert System - Data Driven**/
        /**Expert System - Data Driven**/
        if((!csc_equ.contains("x") && csc_equ.length()>0) ||coefficient_string.equals("0") || coefficient_num==0 || csc_constant_string.equals("0") || csc_constant_num==0){
            answer = "0.0@Equ_solved";
        }

        if(csc_equ.contains("x") && csc_equ.length()>1 && !equ_contains_pie && !csc_equ.equals("-x")){
            constant_of_x = Double.parseDouble(csc_equ.substring(0,csc_equ.length()-1));
            answer = -1*constant_of_x + "cot(" +csc_equ +")"+" csc("+ csc_equ +")@Equ_solved";

            if(coefficient_exists){
                answer = -1*coefficient_num*constant_of_x + "cot(" +csc_equ +")"+" csc("+ csc_equ +")@Equ_solved";
            }
            if(csc_constant_exists){
                answer = -1*csc_constant_num*constant_of_x + "cot(" +csc_equ +")"+" csc("+ csc_equ +")@Equ_solved";
            }
            if(csc_constant_exists && coefficient_exists){
                answer = -1*coefficient_num*csc_constant_num*constant_of_x + "cot(" +csc_equ +")"+" csc("+ csc_equ +")@Equ_solved";
            }
            if(constant_of_x==0){
                answer = "0.0@Equ_solved";
            }

        }else if(csc_equ.contains("x") && csc_equ.length()>1 && equ_contains_pie && !csc_equ.equals("πx") && !csc_equ.equals("-x")){

            if(csc_equ.equals("-πx")) {
                constant_of_x = -3.14;
                answer = "πcot(" +csc_equ +")"+" csc("+ csc_equ +")@Equ_solved";
            }else if(csc_equ.equals("+πx")) {
                constant_of_x = +3.14;
                answer = "-πcot(" +csc_equ +")"+" csc("+ csc_equ +")@Equ_solved";
            }else {
                constant_of_x = Double.parseDouble(csc_equ.substring(0, csc_equ.length() - 2));
                answer = -1*constant_of_x + "πcot(" +csc_equ +")"+" csc("+ csc_equ +")@Equ_solved";
            }


            if(coefficient_exists){
                answer = -1*coefficient_num*constant_of_x + "πcot(" +csc_equ +")"+" csc("+ csc_equ +")@Equ_solved";
            }
            if(csc_constant_exists){
                answer = -1*csc_constant_num*constant_of_x + "πcot(" +csc_equ +")"+" csc("+ csc_equ +")@Equ_solved";
            }
            if(csc_constant_exists && coefficient_exists){
                answer = -1*coefficient_num*csc_constant_num*constant_of_x + "πcot(" +csc_equ +")"+" csc("+ csc_equ +")@Equ_solved";
            }
            if(constant_of_x==0){
                answer = "0.0@Equ_solved";
            }

        }else if(csc_equ.equals("0")){
            answer = "0.0@Equ_solved";

        }else if(csc_equ.equals("πx")){
            answer = "-πcot(" +csc_equ +")"+" csc("+ csc_equ +")@Equ_solved";
            if(coefficient_exists){
                answer = -1*coefficient_num*constant_of_x + "πcot(" +csc_equ +")"+" csc("+ csc_equ +")@Equ_solved";
            }
            if(csc_constant_exists){
                answer = -1*csc_constant_num*constant_of_x + "πcot(" +csc_equ +")"+" csc("+ csc_equ +")@Equ_solved";
            }
            if(csc_constant_exists && coefficient_exists){
                answer = -1*coefficient_num*csc_constant_num*constant_of_x + "πcot(" +csc_equ +")"+" csc("+ csc_equ +")@Equ_solved";
            }
        }else if(csc_equ.equals("-x")){
            answer = -1*-1*coefficient_num*csc_constant_num*constant_of_x + "cot(" +csc_equ +")"+" csc("+ csc_equ +")@Equ_solved";
        }else if(csc_equ.equals("x")){
            answer = -1*coefficient_num*csc_constant_num*constant_of_x + "cot(" +csc_equ +")"+" csc("+ csc_equ +")@Equ_solved";
        }

        middleMan_interface.data_carrier(answer + "csc_Solving");
    }//end csc_Solving()











    /**************************************************************WE ARE SOLVING cot DOWN HERE********************************************************/
    /**************************************************************WE ARE SOLVING cot DOWN HERE********************************************************/
    /**************************************************************WE ARE SOLVING cot DOWN HERE********************************************************/

    private void cot_Solving(String coefficient_string, String cot_constant_string, String cot_equ){
        String answer = "null";
        double constant_of_x = 1;
        double coefficient_num = 1;
        double cot_constant_num = 1;
        boolean coefficient_exists = false;
        boolean cot_constant_exists = false;
        boolean equ_contains_pie = false;


        /**check if equation is of form [2ππ] or [2xx]**/
        char [] chars = cot_equ.toCharArray();
        int count_x = 0;
        int count_π = 0;
        for (char aChar : chars) {
            if (aChar == 'x') {
                count_x++;
            } else if (aChar == 'π') {
                count_π++;
            }
        }//end for()

        if(count_x>1 || count_π>1){
            popup_dialog("Incorrect entry", "Use □ ² or □ ˣ\nto calculate multiple variables");
            return;
        }
        /**DONE!!! check if equation is of form [2ππ] or [2xx]**/


        /**check if equation for usable constants]**/
        if(!coefficient_string.equals("0") && coefficient_string.length()>0 && !coefficient_string.contains("π")){
            coefficient_num = Double.parseDouble(coefficient_string);
            coefficient_exists = true;
        }else if(!coefficient_string.equals("0") && coefficient_string.length()>0 && coefficient_string.contains("π")){

            if(coefficient_string.contains("π") && coefficient_string.length()>1 && !coefficient_string.equals("-π") && !coefficient_string.equals("+π")){
                coefficient_num = 3.14 * Double.parseDouble(coefficient_string.substring(0,coefficient_string.length()-1));
                coefficient_exists = true;
            }

            if(coefficient_string.equals("-π")){
                coefficient_num = -3.14;
                coefficient_exists = true;
            }
            if(coefficient_string.equals("+π")){
                coefficient_num = 3.14;
                coefficient_exists = true;
            }

            if((coefficient_string.equals("π"))){
                coefficient_num = 3.14;
                coefficient_exists = true;
            }
        }

        if(!cot_constant_string.equals("0") && cot_constant_string.length()>0 && !cot_constant_string.contains("π")){
            cot_constant_num = Double.parseDouble(cot_constant_string);
            cot_constant_exists = true;
        }else if(!cot_constant_string.equals("0") && cot_constant_string.length()>0 && cot_constant_string.contains("π")){

            if((cot_constant_string.contains("π") && cot_constant_string.length()>1) && !cot_constant_string.equals("-π") && !cot_constant_string.equals("+π")){
                cot_constant_num = 3.14 * Double.parseDouble(cot_constant_string.substring(0,cot_constant_string.length()-1));
                cot_constant_exists = true;
            }

            if(cot_constant_string.equals("-π")){
                cot_constant_num = -3.14;
                cot_constant_exists = true;
            }

            if(cot_constant_string.equals("+π")){
                cot_constant_num = 3.14;
                cot_constant_exists = true;
            }

            if((cot_constant_string.equals("π"))){
                cot_constant_num = 3.14;
                cot_constant_exists = true;
            }
        }


        /**check if equation contains a pie***/
        if(cot_equ.contains("π")){
            equ_contains_pie = true;
        }

        /**Expert System - Data Driven**/
        /**Expert System - Data Driven**/
        /**Expert System - Data Driven**/
        if((!cot_equ.contains("x") && cot_equ.length()>0) ||coefficient_string.equals("0") || coefficient_num==0 || cot_constant_string.equals("0") || cot_constant_num==0){
            answer = "0.0@Equ_solved";
        }

        if(cot_equ.contains("x") && cot_equ.length()>1 && !equ_contains_pie && !cot_equ.equals("-x")){
            constant_of_x = Double.parseDouble(cot_equ.substring(0,cot_equ.length()-1));
            answer = -1*constant_of_x + "csc²(" +cot_equ +")@Equ_solved" ;

            if(coefficient_exists){
                answer = -1*coefficient_num*constant_of_x + "csc²(" +cot_equ +")@Equ_solved" ;
            }
            if(cot_constant_exists){
                answer = -1*cot_constant_num*constant_of_x + "csc²(" +cot_equ +")@Equ_solved" ;
            }
            if(cot_constant_exists && coefficient_exists){
                answer = -1*coefficient_num*cot_constant_num*constant_of_x + "csc²(" +cot_equ +")@Equ_solved" ;
            }
            if(constant_of_x==0){
                answer = "0.0@Equ_solved";
            }

        }else if(cot_equ.contains("x") && cot_equ.length()>1 && equ_contains_pie && !cot_equ.equals("πx") && !cot_equ.equals("-x")){

            if(cot_equ.equals("-πx")) {
                constant_of_x = -3.14;
                answer = "πcsc²(" +cot_equ +")@Equ_solved" ;
            }else if(cot_equ.equals("+πx")) {
                constant_of_x = +3.14;
                answer = "-πcsc²(" +cot_equ +")@Equ_solved" ;
            }else {
                constant_of_x = Double.parseDouble(cot_equ.substring(0, cot_equ.length() - 2));
                answer = -1*constant_of_x + "πcsc²(" +cot_equ +")@Equ_solved" ;
            }


            if(coefficient_exists){
                answer = -1*coefficient_num*constant_of_x + "πcsc²(" +cot_equ +")@Equ_solved" ;
            }
            if(cot_constant_exists){
                answer = -1*cot_constant_num*constant_of_x + "πcsc²(" +cot_equ +")@Equ_solved" ;
            }
            if(cot_constant_exists && coefficient_exists){
                answer = -1*coefficient_num*cot_constant_num*constant_of_x + "πcsc²(" +cot_equ +")@Equ_solved" ;
            }
            if(constant_of_x==0){
                answer = "0.0@Equ_solved";
            }

        }else if(cot_equ.equals("0")){
            answer = "0.0@Equ_solved";

        }else if(cot_equ.equals("πx")){
            answer = "πcsc²(" +cot_equ +")@Equ_solved";
            if(coefficient_exists){
                answer = -1*coefficient_num*constant_of_x + "πcsc²(" +cot_equ +")@Equ_solved" ;
            }
            if(cot_constant_exists){
                answer = -1*cot_constant_num*constant_of_x + "πcsc²(" +cot_equ +")@Equ_solved" ;
            }
            if(cot_constant_exists && coefficient_exists){
                answer = -1*coefficient_num*cot_constant_num*constant_of_x + "πsec²(" +cot_equ +")@Equ_solved" ;
            }
        }else if(cot_equ.equals("-x")){
            answer = -1*-1*coefficient_num*cot_constant_num*constant_of_x + "sec²(" +cot_equ +")@Equ_solved" ;

        }else if(cot_equ.equals("x")){
            answer = -1*coefficient_num*cot_constant_num*constant_of_x + "sec²(" +cot_equ +")@Equ_solved" ;
        }

        middleMan_interface.data_carrier(answer + "cot_Solving");
    }//end cot_Solving()











}//end CLASS
