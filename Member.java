class Member {
    private int memberId;
    private String memberName;
    private int memberAge;
    private String memberGender;
    private String memberAddress;

    public Member(int memberId, String memberName, int memberAge, String memberGender, String memberAddress) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberAge = memberAge;
        this.memberGender = memberGender;
        this.memberAddress = memberAddress;
    }

    public int getMemberId() {
        return memberId;
    }

    public String toString() {
        return "Member " + memberId + ": " + memberName + " (" + memberAge + ", " + memberGender + ", " + memberAddress + ")";
    }
}