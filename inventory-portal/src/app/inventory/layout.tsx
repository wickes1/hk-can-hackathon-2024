export default function Layout(props: {
  uploadImageForm: React.ReactNode;
  children: React.ReactNode;
}) {
  return (
    <>
      {props.children}
      {props.uploadImageForm}
    </>
  );
}
