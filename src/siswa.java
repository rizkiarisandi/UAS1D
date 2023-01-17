public class siswa {
        private Long id;
        private String nim;
        private String name;
        private byte age;
        private String address;
        private String phoneNo;

        public void setId(Long id){
            this.id = id;
        }

        public Long getId(){
            return id;
        }
        public void setNim(String nim){
            this.nim = nim;
        }
        public String getNim(){
            return nim;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
        public void setAge(byte age){
            this.age = age;
        }
        public byte getAge(){
            return age;
        }
        public void setAddress(String address){
            this.address = address;
        }
        public String getAddress(){
            return address;
        }
        public void setPhoneNo(String phoneNo){
            this.phoneNo = phoneNo;
        }
        public String getPhoneNo(){
            return phoneNo;
        }
    }
