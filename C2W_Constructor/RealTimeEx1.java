// Example 1
class Project {
    String projName = "onlineEduPlatform";
    int empCount = 20;

    void clientInfo() {
        String clientName = "Core2Web";
        System.out.println(clientName);
        System.out.println(projName);
    }
}

class C2W {
    public static void main(String[] args) {
        Project start = new Project();
        start.clientInfo();
    }
}