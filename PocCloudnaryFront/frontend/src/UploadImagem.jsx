import React, { useState } from "react";

function UploadImagem() {
  const [files, setFiles] = useState([]);
  const [resposta, setResposta] = useState(null);

  const handleUpload = async () => {
    if (files.length === 0) return alert("Selecione pelo menos uma imagem");

    const formData = new FormData();
    formData.append("file", files[0]);
    formData.append("titulo", "Título de exemplo");
    formData.append("descricao", "Descrição do imóvel");

    const response = await fetch("http://localhost:8080/api/upload", {
      method: "POST",
      body: formData,
    });

    const url = await response.text();

    setResposta({
      titulo: "Título de exemplo",
      descricao: "Descrição do imóvel",
      imagens: [{ id: 1, url }],
    });
  };

  return (
    <div>
      <input
        type="file"
        accept="image/*"
        onChange={(e) => setFiles(e.target.files)}
      />
      <button onClick={handleUpload}>Fazer Upload</button>

      {resposta && (
        <div style={{ marginTop: "20px" }}>
          <h2>{resposta.titulo}</h2>
          <p>{resposta.descricao}</p>
          {resposta.imagens.map((img) => (
            <img
              key={img.id}
              src={img.url}
              alt="Imagem enviada"
              style={{ width: "300px", borderRadius: "8px" }}
            />
          ))}
        </div>
      )}
    </div>
  );
}

export default UploadImagem;
