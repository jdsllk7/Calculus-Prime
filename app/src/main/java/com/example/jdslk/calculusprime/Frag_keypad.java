package com.example.jdslk.calculusprime;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.security.AccessController;

import static java.security.AccessController.*;


public class Frag_keypad extends Fragment {


    /*******OTHER Variables******/
    private MiddleMan_Interface middleMan_interface;
    private String focus = "jdslk";
    private String focusing = "jdslk";
    private String ultimate_solution = "jdslk";
    private TextView solution_coreEqu;
    private RelativeLayout solution_container;


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        middleMan_interface = (MiddleMan_Interface)activity;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View mainActivity = inflater.inflate(R.layout.frag_keypad, container, false);



        /***************LINK BUTTON IDs****************/
        final Button btn_id_log_box = mainActivity.findViewById(R.id.btn_id_log_box);
        final Button btn_id_box_divide_box = mainActivity.findViewById(R.id.btn_id_box_divide_box);
        final Button btn_id_log_ln_box = mainActivity.findViewById(R.id.btn_id_log_ln_box);
        final Button btn_id_square_root_box = mainActivity.findViewById(R.id.btn_id_square_root_box);
        final Button btn_id_box_square_root_box = mainActivity.findViewById(R.id.btn_id_box_square_root_box);
        final Button btn_id_log_e_box = mainActivity.findViewById(R.id.btn_id_log_e_box);
        final Button btn_id_log_box_box = mainActivity.findViewById(R.id.btn_id_log_box_box);
        final Button btn_id_box_power_box = mainActivity.findViewById(R.id.btn_id_box_power_box);
        final Button btn_id_box_power_two = mainActivity.findViewById(R.id.btn_id_box_power_two);
        final Button btn_id_trig_sin = mainActivity.findViewById(R.id.btn_id_trig_sin);
        final Button btn_id_trig_cos = mainActivity.findViewById(R.id.btn_id_trig_cos);
        final Button btn_id_trig_tan = mainActivity.findViewById(R.id.btn_id_trig_tan);
        final Button btn_id_trig_cot = mainActivity.findViewById(R.id.btn_id_trig_cot);
        final Button btn_id_trig_sec = mainActivity.findViewById(R.id.btn_id_trig_sec);
        final Button btn_id_trig_csc = mainActivity.findViewById(R.id.btn_id_trig_csc);
        final Button btn_zero = mainActivity.findViewById(R.id.btn_zero);
        final Button btn_one = mainActivity.findViewById(R.id.btn_one);
        final Button btn_two = mainActivity.findViewById(R.id.btn_two);
        final Button btn_three = mainActivity.findViewById(R.id.btn_three);
        final Button btn_four = mainActivity.findViewById(R.id.btn_four);
        final Button btn_five = mainActivity.findViewById(R.id.btn_five);
        final Button btn_six = mainActivity.findViewById(R.id.btn_six);
        final Button btn_seven = mainActivity.findViewById(R.id.btn_seven);
        final Button btn_eight = mainActivity.findViewById(R.id.btn_eight);
        final Button btn_nine = mainActivity.findViewById(R.id.btn_nine);
        final Button btn_decimal = mainActivity.findViewById(R.id.btn_decimal);
        final Button btn_plus = mainActivity.findViewById(R.id.btn_plus);
        final Button btn_minus = mainActivity.findViewById(R.id.btn_minus);
        final Button btn_division = mainActivity.findViewById(R.id.btn_division);
        final Button btn_multiply = mainActivity.findViewById(R.id.btn_multiply);
        final Button btn_x = mainActivity.findViewById(R.id.btn_x);
        final Button btn_pie = mainActivity.findViewById(R.id.btn_pie);
        final Button btn_backspace = mainActivity.findViewById(R.id.btn_backspace);
        final Button rad_deg_button = mainActivity.findViewById(R.id.rad_deg_button);
        final Button solve_button = mainActivity.findViewById(R.id.solve_button);
        final Button solution_back_btn = mainActivity.findViewById(R.id.solution_back_btn);
        final Button solution_steps_btn = mainActivity.findViewById(R.id.solution_steps_btn);
        solution_container = mainActivity.findViewById(R.id.solution_container);
        solution_coreEqu = mainActivity.findViewById(R.id.solution_coreEqu);





        /********************************START BUTTON FRAGMENT LISTENERS*****************************************/
        /********************************IF Default EditText is focused then Inflate Equ UI*************************/




        /**0.1. btn_zero LISTENER**/
        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("zero");
                    }//end if()
                }

            }});

        /**0.2. btn_one LISTENER**/
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("one");
                    }//end if()
                }

            }});

        /**0.3. btn_two LISTENER**/
        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("two");
                    }//end if()
                }

            }});

        /**0.4. btn_three LISTENER**/
        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("three");
                    }//end if()
                }

            }});

        /**0.5. btn_four LISTENER**/
        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("four");
                    }//end if()
                }

            }});

        /**0.6. btn_five LISTENER**/
        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("five");
                    }//end if()
                }

            }});

        /**0.7. btn_six LISTENER**/
        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("six");
                    }//end if()
                }

            }});

        /**0.8. btn_seven LISTENER**/
        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("seven");
                    }//end if()
                }

            }});

        /**0.9. btn_eight LISTENER**/
        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("eight");
                    }//end if()
                }

            }});

        /**0.10. btn_nine LISTENER**/
        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("nine");
                    }//end if()
                }

            }});

        /**0.11. btn_decimal LISTENER**/
        btn_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("decimal");
                    }//end if()
                }

            }});

        /**0.12. btn_pie LISTENER**/
        btn_pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("pie");
                    }//end if()
                }

            }});

        /**0.13. btn_plus LISTENER**/
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("plus");
                    }//end if()
                }

            }});

        /**0.14. btn_minus LISTENER**/
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("minus");
                    }//end if()
                }

            }});

        /**0.15. btn_multiply LISTENER**/
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("multiply");
                    }//end if()
                }

            }});

        /**0.16. btn_divide LISTENER**/
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("division");
                    }//end if()
                }

            }});

        /**0.17. btn_x LISTENER**/
        btn_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("x");
                    }//end if()
                }

            }});






        /********************************************EQUATION UI BUTTONS********************************************************/

        /**1. btn_id_trig_sin LISTENER**/
        btn_id_trig_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(focus.equals("coreEqu_focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("sin");
                    }//end if()
                }

            }});



        /**2. btn_id_trig_cos LISTENER**/
        btn_id_trig_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(focus.equals("coreEqu_focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("cos");
                    }//end if()
                }

            }});



        /**3. btn_id_trig_tan LISTENER**/
        btn_id_trig_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(focus.equals("coreEqu_focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("tan");
                    }//end if()
                }

            }});


        /**4. btn_id_trig_sec LISTENER**/
        btn_id_trig_sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(focus.equals("coreEqu_focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("sec");
                    }//end if()
                }

            }});


        /**5. btn_id_trig_csc LISTENER**/
        btn_id_trig_csc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(focus.equals("coreEqu_focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("csc");
                    }//end if()
                }

            }});



        /**6. btn_id_trig_cot LISTENER**/
        btn_id_trig_cot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(focus.equals("coreEqu_focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("cot");
                    }//end if()
                }

            }});


        /**7. btn_id_log_box LISTENER**/
        btn_id_log_box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(focus.equals("coreEqu_focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("log_ten");
                    }//end if()
                }

            }});



        /**8. btn_id_box_square_root_box LISTENER**/
        btn_id_box_square_root_box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(focus.equals("coreEqu_focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("any_root");
                    }//end if()
                }

            }});



        /**9. btn_id_log_box_box LISTENER**/
        btn_id_log_box_box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(focus.equals("coreEqu_focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("log_base");
                    }//end if()
                }

            }});



        /**10. btn_id_log_e_box LISTENER**/
        btn_id_log_e_box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(focus.equals("coreEqu_focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("e");
                    }//end if()
                }

            }});


        /**11. btn_id_log_ln_box LISTENER**/
        btn_id_log_ln_box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(focus.equals("coreEqu_focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("ln");
                    }//end if()
                }

            }});


        /**12. btn_id_box_power_box LISTENER**/
        btn_id_box_power_box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(focus.equals("coreEqu_focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("power");
                    }//end if()
                }

            }});


        /**13. btn_id_box_power_two LISTENER**/
        btn_id_box_power_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(focus.equals("coreEqu_focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("squared");
                    }//end if()
                }

            }});


        /**14. btn_id_square_root_box LISTENER**/
        btn_id_square_root_box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(focus.equals("coreEqu_focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("square_root");
                    }//end if()
                }

            }});


        /**15. btn_id_box_divide_box LISTENER**/
        btn_id_box_divide_box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(focus.equals("coreEqu_focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("divide");
                    }//end if()
                }

            }});


        /**16. rad_deg_button LISTENER**/
        rad_deg_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(middleMan_interface != null) {
                middleMan_interface.data_carrier("rad_deg_button_clicked");
                if (rad_deg_button.getText().equals("deg")) {
                    rad_deg_button.setText("rad");
                } else {
                    rad_deg_button.setText("deg");
                }
            }

            }
        });


        /**17. solve_button LISTENER**/
        solve_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (middleMan_interface != null) {
                    middleMan_interface.data_carrier("test_before_solve");
                }//end if()

                if(focus.equals("solved")){
                    solution_container.setVisibility(View.VISIBLE);
                    focus = ("jdslk");
                }
            }
        });


        /**18. solve_button LISTENER**/
        solution_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution_container.setVisibility(View.GONE);
                solution_steps_btn.setText("Show steps");
            }
        });

        /**18. solve_button LISTENER**/
        solution_steps_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //solution_steps_textView.setVisibility(View.VISIBLE);
                if (solution_steps_btn.getText().equals("Show steps")) {
                    solution_steps_btn.setText("Solution");

                    if(focusing.equals("coreEqu_Solving")){
                        solution_coreEqu.setText("The Differential rule of\n\nany mathematical term\n\nstates that\nif y=axˣ then dy/dx = anxⁿ⁻ⁱ");
                    }

                    if(focusing.equals("cos_Solving")){
                        solution_coreEqu.setText("For any cosine equation\n\nsuch that: y=cos(ax)\n\ndy/dx=-a sin(ax)\n\nUse the Chain rule to find derivatives of sin() & ax\n\ni.e. dy/dx=dy/du x du/dx");
                    }

                    if(focusing.equals("sin_Solving")){
                        solution_coreEqu.setText("For any sine equation\n\nsuch that: y=sin(ax)\n\ndy/dx=a cos(ax)\n\nUse the Chain rule to find derivatives of sin() & ax\n\ni.e. dy/dx=dy/du x du/dx");
                    }

                    if(focusing.equals("tan_Solving")){
                        solution_coreEqu.setText("For any tangent equation\n\nsuch that: y=tan(ax)\n\ndy/dx=a sec²(ax)\n\nUse the Chain rule to find derivatives of sin() & ax\n\ni.e. dy/dx=dy/du x du/dx");
                    }

                    if(focusing.equals("sec_Solving")){
                        solution_coreEqu.setText("For any secant equation\n\nsuch that: y=sec(ax)\n\ndy/dx=a sec(ax) tan(ax)\n\nUse the Chain rule to find derivatives of sin() & ax\n\ni.e. dy/dx=dy/du x du/dx");
                    }

                    if(focusing.equals("cot_Solving")){
                        solution_coreEqu.setText("For any cotangent equation\n\nsuch that: y=cot(ax)\n\ndy/dx=-a csc²(ax)\n\nUse the Chain rule to find derivatives of sin() & ax\n\ni.e. dy/dx=dy/du x du/dx");
                    }

                    if(focusing.equals("csc_Solving")){
                        solution_coreEqu.setText("For any cosecant equation\n\nsuch that: y=csc(ax)\n\ndy/dx=-a csc(ax) cot(ax)\n\nUse the Chain rule to find derivatives of sin() & ax\n\ni.e. dy/dx=dy/du x du/dx");
                    }


                } else {
                    solution_steps_btn.setText("Show steps");
                    solution_coreEqu.setText(ultimate_solution);
                }
            }
        });


        /**19. btn_backspace LISTENER**/
        btn_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if and EditText from Frag_differentiate_functions has gained focus
                //that's why we're using .contains
                if(focus.contains("focused_gained")) {
                    if (middleMan_interface != null) {
                        middleMan_interface.data_carrier("backspace");
                    }//end if()
                }
            }
        });

        /********************************END BUTTON FRAGMENT LISTENERS*****************************************/



        return mainActivity;
    }//end onCreateView()



    public void change_data(String data){

        /**********************Switch-stmt Monitors LOST & GAIN focus of EditText Boxes************/
        /************Get string instructions from Frag_differentiate_functions*********************/
        switch (data) {

            /**0.1**/
            case "screen_cleared":
                solution_container.setVisibility(View.GONE);
                break;
            case "any_root_constant_focused_gained":
                focus = "any_root_constant_focused_gained";
                break;
            case "any_root_constant_focused_lost":
                focus = "any_root_constant_focused_lost";
                break;

            /**0.2**/
            case "log_base_constant_focused_gained":
                focus = "log_base_constant_focused_gained";
                break;
            case "log_base_constant_focused_lost":
                focus = "log_base_constant_focused_lost";
                break;

            /**0.3**/
            case "square_root_constant_focused_gained":
                focus = "square_root_constant_focused_gained";
                break;
            case "square_root_constant_focused_lost":
                focus = "square_root_constant_focused_lost";
                break;

            /**0.4**/
            case "e_constant_focused_gained":
                focus = "e_constant_focused_gained";
                break;
            case "e_constant_focused_lost":
                focus = "e_constant_focused_lost";
                break;

            /**0.5**/
            case "ln_constant_focused_gained":
                focus = "ln_constant_focused_gained";
                break;
            case "ln_constant_focused_lost":
                focus = "ln_constant_focused_lost";
                break;

            /**0.6**/
            case "log_ten_constant_focused_gained":
                focus = "log_ten_constant_focused_gained";
                break;
            case "log_ten_constant_focused_lost":
                focus = "log_ten_constant_focused_lost";
                break;

            /**0.7**/
            case "sin_constant_focused_gained":
                focus = "sin_constant_focused_gained";
                break;
            case "sin_constant_focused_lost":
                focus = "sin_constant_focused_lost";
                break;

            /**0.8**/
            case "tan_constant_focused_gained":
                focus = "tan_constant_focused_gained";
                break;
            case "tan_constant_focused_lost":
                focus = "tan_constant_focused_lost";
                break;

            /**0.9**/
            case "cos_constant_focused_gained":
                focus = "cos_constant_focused_gained";
                break;
            case "cos_constant_focused_lost":
                focus = "cos_constant_focused_lost";
                break;

            /**0.10**/
            case "csc_constant_focused_gained":
                focus = "csc_constant_focused_gained";
                break;
            case "csc_constant_focused_lost":
                focus = "csc_constant_focused_lost";
                break;

            /**0.11**/
            case "cot_constant_focused_gained":
                focus = "cot_constant_focused_gained";
                break;
            case "cot_constant_focused_lost":
                focus = "cot_constant_focused_lost";
                break;

            /**0.12**/
            case "sec_constant_focused_gained":
                focus = "sec_constant_focused_gained";
                break;
            case "sec_constant_focused_lost":
                focus = "sec_constant_focused_lost";
                break;

            /**0.13**/
            case "constant_focused_gained":
                focus = "constant_focused_gained";
                break;
            case "constant_focused_lost":
                focus = "constant_focused_lost";
                break;

            /**0**/
            case "dydx_denominator_focused_gained":
                focus = "dydx_denominator_focused_gained";
                break;
            case "dydx_denominator_focused_lost":
                focus = "dydx_denominator_focused_lost";
                break;

            /**1**/
            case "coreEqu_focused_gained":
                focus = "coreEqu_focused_gained";
                break;
            case "coreEqu_focused_lost":
                focus = "coreEqu_focused_lost";
                break;

            /**2**/
            case "denominator_box_focused_gained":
                focus = "denominator_box_focused_gained";
                break;
            case "denominator_box_focused_lost":
                focus = "denominator_box_focused_lost";
                break;

            /**3**/
            case "numerator_box_focused_gained":
                focus = "numerator_box_focused_gained";
                break;
            case "numerator_box_focused_lost":
                focus = "numerator_box_focused_lost";
                break;

            /**4**/
            case "pre_any_root_box_focused_gained":
                focus = "pre_any_root_box_focused_gained";
                break;
            case "pre_any_root_box_focused_lost":
                focus = "pre_any_root_box_focused_lost";
                break;

            /**5**/
            case "post_any_root_box_focused_gained":
                focus = "post_any_root_box_focused_gained";
                break;
            case "post_any_root_box_focused_lost":
                focus = "post_any_root_box_focused_lost";
                break;

            /**6**/
            case "superScript_box_focused_gained":
                focus = "superScript_box_focused_gained";
                break;
            case "superScript_box_focused_lost":
                focus = "superScript_box_focused_lost";
                break;

            /**7**/
            case "power_box_focused_gained":
                focus = "power_box_focused_gained";
                break;
            case "power_box_focused_lost":
                focus = "power_box_focused_lost";
                break;

            /**8**/
            case "superScript_focused_gained":
                focus = "superScript_focused_gained";
                break;
            case "superScript_focused_lost":
                focus = "superScript_focused_lost";
                break;

            /**9**/
            case "log_base_box_focused_gained":
                focus = "log_base_box_focused_gained";
                break;
            case "log_base_box_focused_lost":
                focus = "log_base_box_focused_lost";
                break;

            /**10**/
            case "squared_box_focused_gained":
                focus = "squared_box_focused_gained";
                break;
            case "squared_box_focused_lost":
                focus = "squared_box_focused_lost";
                break;

            /**11**/
            case "square_root_box_focused_gained":
                focus = "square_root_box_focused_gained";
                break;
            case "square_root_box_focused_lost":
                focus = "square_root_box_focused_lost";
                break;

            /**12**/
            case "e_box_focused_gained":
                focus = "e_box_focused_gained";
                break;
            case "e_box_focused_lost":
                focus = "e_box_focused_lost";
                break;

            /**13**/
            case "ln_box_focused_gained":
                focus = "ln_box_focused_gained";
                break;
            case "ln_box_focused_lost":
                focus = "ln_box_focused_lost";
                break;

            /**14**/
            case "log_ten_box_focused_gained":
                focus = "log_ten_box_focused_gained";
                break;
            case "log_ten_box_focused_lost":
                focus = "log_ten_box_focused_lost";
                break;

            /**15**/
            case "cos_box_focused_gained":
                focus = "cos_box_focused_gained";
                break;
            case "cos_box_focused_lost":
                focus = "cos_box_focused_lost";
                break;

            /**16**/
            case "sin_box_focused_gained":
                focus = "sin_box_focused_gained";
                break;
            case "sin_box_focused_lost":
                focus = "sin_box_focused_lost";
                break;

            /**17**/
            case "tan_box_focused_gained":
                focus = "tan_box_focused_gained";
                break;
            case "tan_box_focused_lost":
                focus = "tan_box_focused_lost";
                break;

            /**18**/
            case "sec_box_focused_gained":
                focus = "sec_box_focused_gained";
                break;
            case "sec_box_focused_lost":
                focus = "sec_box_focused_lost";
                break;

            /**19**/
            case "cot_box_focused_gained":
                focus = "cot_box_focused_gained";
                break;
            case "cot_box_focused_lost":
                focus = "cot_box_focused_lost";
                break;

            /**20**/
            case "csc_box_focused_gained":
                focus = "csc_box_focused_gained";
                break;

            case "csc_box_focused_lost":
                focus = "csc_box_focused_lost";
                break;
        }//end switch


        if(data.contains("@Equ_solved")){
            print_coreEqu_solution(data);
            focus = "solved";
        }



        /****************************************SOLUTION DISPLAYS****************************************************************8*/
        if(data.contains("coreEqu_Solving")){
            focusing = "coreEqu_Solving";
        }

        if(data.contains("cos_Solving")){
            focusing = "cos_Solving";
        }

        if(data.contains("sin_Solving")){
            focusing = "sin_Solving";
        }

        if(data.contains("tan_Solving")){
            focusing = "tan_Solving";
        }

        if(data.contains("csc_Solving")){
            focusing = "csc_Solving";
        }

        if(data.contains("cot_Solving")){
            focusing = "cot_Solving";
        }

        if(data.contains("sec_Solving")){
            focusing = "sec_Solving";
        }





    }//end change_data()

    /************Print Solution of coreEqu***********/
    private void print_coreEqu_solution(String data){

        String [] splitArray1 = data.split("@");
        ultimate_solution = "Solution:\n\n\n"+splitArray1[0];
        solution_coreEqu.setText(ultimate_solution);

    }//end print_coreEqu_solution()

}// end CLASS