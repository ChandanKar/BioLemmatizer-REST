# Import project into eclipse
  - git clone https://github.com/ChandanKar/BioLemmatizer-REST.git
  - mvn eclipse:eclipse

# development run
  - git clone https://github.com/ChandanKar/BioLemmatizer-REST.git
  - mvn clean
  - mvn spring-boot:run
  - browse http://localhost:8080/
  - Lemmatizer url 
    - uninteractive: http://localhost:8080/bio/lemmatizer?inputStr=india and http://localhost:8080/bio/lemmatizer?inputStr=india&inputStrPos=""
    - interactive: http://localhost:8080/bio/lemmatizer2?inputStr=india and http://localhost:8080/bio/lemmatizer2?inputStr=india&inputStrPos=""
  
# Production run
  - go to C:\Users\<logged in user>\.m2\repository\com\chandan\spring\BioLemmatizer-REST\1.0.1-SNAPSHOT\
  - java -jar BioLemmatizer-REST-1.0.1-SNAPSHOT.jar
  - browse http://localhost:8080/
  - Lemmatizer url 
    - uninteractive: http://localhost:8080/bio/lemmatizer?inputStr=india or http://localhost:8080/bio/lemmatizer?inputStr=india&inputStrPos=""
    - interactive: http://localhost:8080/bio/lemmatizer2?inputStr=india or http://localhost:8080/bio/lemmatizer2?inputStr=india&inputStrPos=""
