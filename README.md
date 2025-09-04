# 📦 POC: Upload de Imagens com Spring Boot, React e Cloudinary

Este projeto é uma **Prova de Conceito (POC)** para upload de imagens utilizando:

- 🌱 **Spring Boot** no backend  
- ⚛️ **React** no frontend  
- ☁️ **Cloudinary** para armazenamento de imagens na nuvem  

---

## 📸 Funcionalidades

- Selecionar uma imagem no frontend  
- Fazer upload via formulário (com `FormData`)  
- Enviar para o backend via `POST /api/upload`  
- Backend envia a imagem para o Cloudinary  
- Backend retorna a **URL da imagem hospedada**  
- Frontend exibe a imagem após o upload  

---

## 🔧 Tecnologias Utilizadas

### Backend (Java Spring Boot)
- Spring Web  
- Spring Boot DevTools  
- Cloudinary SDK  

### Frontend (React)
- ReactJS (Vite ou Create React App)  
- Fetch API para envio de dados  
- Formulário com preview da imagem  

### Serviços
- [Cloudinary](https://cloudinary.com) – armazenamento gratuito de imagens  

---

## 🚀 Como Rodar o Projeto


### Backend - Spring Boot
- git clone https://github.com/seu-usuario/poc-cloudinary-upload.git
- cd poc-cloudinary-upload/backend
- Abra o arquivo backend/src/main/java/Penelope/PocCloudinary/service/cloudnaryService.java e insira suas credenciais do Cloudinary
- Execute o projeto

## 🌐 Frontend - React

- Vá para o diretório do frontend: cd ../frontend
- Instale as dependências: npm install
- Rode a aplicação:
# Se estiver usando Vite
npm run dev

# ou, se estiver usando Create React App
npm start

- Acesse a aplicação no seu navegador em: http://localhost:5173/

### 📁 Estrutura de Pastas

poc-cloudinary-upload/

├── backend/

│   └── src/main/java/Penelope/PocCloudinary/

│       ├── controller/cloudnaryController.java
│       └── service/cloudnaryService.java

├── frontend/
│   ├── src/

│   │   ├── App.jsx
│   │   └── UploadImagem.jsx

└── README.md

### ⚠️ Observações
- Este projeto é uma Prova de Conceito (POC) e não inclui funcionalidades como persistência em banco de dados.

- Atenção: As credenciais da API do Cloudinary estão expostas diretamente no código-fonte. Isso não é recomendado para ambientes de produção.

- Para um ambiente de produção, utilize variáveis de ambiente e práticas de segurança adequadas (por exemplo, application.properties com Spring Config Server ou variáveis de ambiente do sistema).
