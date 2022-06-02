package com.revature.facelessbook.models;




    public class Users {
        private int userid;
        private String password;
        private String username;
        private String biography;

        Users(){}
        Users(Integer userid, String password, String username, String biography){
            this.userid = userid;
            this.password = password;
            this.username = username;
            this.biography = biography;
        }

        public int getUserid() {
            return userid;
        }

        public void setUserid(int userid) {
            this.userid = userid;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getBiography() {
            return biography;
        }

        public void setBiography(String biography) {
            this.biography = biography;
        }
    }


