package com.example.app_deepanshu;

public class teacher
    {

        public String  E_mail,School_name,Name,School_Verify_Key,Mobile,Address,State;

        public teacher()
        {

        }

        public teacher(String E_mail, String School_name, String teach_name,
                       String key, String teach_mobile, String teach_area, String teach_state)
        {
            this.E_mail = E_mail;
            this.School_name = School_name;
            this.Name = teach_name;
            this.School_Verify_Key = key;
            this.Mobile = teach_mobile;
            this.Address = teach_area;
            this.State = teach_state;
        }
    }
